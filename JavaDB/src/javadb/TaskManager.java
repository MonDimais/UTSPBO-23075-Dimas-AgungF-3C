package javadb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class TaskManager extends JFrame {
    private JPanel taskPanel;
    private ArrayList<Task> taskList;

    public TaskManager() {
        // Inisialisasi
        setTitle("Task Manager");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        taskList = new ArrayList<>();

        // Panel untuk daftar task
        taskPanel = new JPanel();
        taskPanel.setLayout(new BoxLayout(taskPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(taskPanel);

        // Tombol Add New Task
        JButton addTaskButton = new JButton("Add New Task");
        addTaskButton.addActionListener(e -> addNewTask());

        // Tambahkan ke frame
        add(scrollPane, BorderLayout.CENTER);
        add(addTaskButton, BorderLayout.NORTH);
    }

    private void addNewTask() {
        // Input data task
        String namaTugas = JOptionPane.showInputDialog("Nama Tugas:");
        String namaMatkul = JOptionPane.showInputDialog("Nama Matkul:");
        String deadline = JOptionPane.showInputDialog("Deadline:");
        String deskripsi = JOptionPane.showInputDialog("Deskripsi:");

        if (namaTugas != null && namaMatkul != null && deadline != null) {
            Task task = new Task(namaTugas, namaMatkul, deadline, deskripsi);
            taskList.add(task);

            // Buat tombol baru
            JButton taskButton = new JButton(task.getNamaTugas());
            taskButton.addActionListener(e -> showTaskDetail(task));
            taskPanel.add(taskButton);
            taskPanel.revalidate(); // Refresh tampilan panel
            taskPanel.repaint();
        }
    }

    private void showTaskDetail(Task task) {
        // Menampilkan detail task
        JOptionPane.showMessageDialog(this,
            "Nama Tugas: " + task.getNamaTugas() + "\n" +
            "Nama Matkul: " + task.getNamaMatkul() + "\n" +
            "Deadline: " + task.getDeadline() + "\n" +
            "Deskripsi: " + task.getDeskripsi(),
            "Task Detail",
            JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TaskManager manager = new TaskManager();
            manager.setVisible(true);
        });
    }
}

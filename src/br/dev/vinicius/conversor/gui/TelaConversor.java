package br.dev.vinicius.conversor.gui;

import javax.swing.*;
import java.awt.*;

public class TelaConversor extends JFrame {
	
	//Janela
	public TelaConversor() {
	
	
	setTitle("Conversor");
	setSize(300,150);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	
	
	
	//Painel para organizar os componentes
	JPanel painel = new JPanel();
	painel.setLayout(new FlowLayout());
	
	//JLabel para rotular o campo de entrada
	JLabel rotulo = new JLabel ("Digite o valor");
	
	//Campo de entrada
	JTextField CampoTexto = new JTextField(10);
	
	painel.add(rotulo);
	painel.add(CampoTexto);
	
	
	painel.add(painel);
	setVisible(true);
	
	
	
	
	
	}	

}

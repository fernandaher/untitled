package menu;

import options.mathsoperations.MathsOperations;

import javax.swing.*;
import java.awt.*;

//hereda a clase JFrame
    public class Menu extends Frame {

    protected JButton btnPrincipalMenu;
    private JButton btnmathsOperations;
    private JPanel principalMenu;

    //constructor
    public Menu(){
        add(principalMenu);
        //dar nombre al formulario parte superior
        setTitle("Principal Menu");
        //tamaño ventana menu
        setSize(500, 600);


        btnmathsOperations.addActionListener(e-> {

                MathsOperations mathsOperations = new MathsOperations();
                //Me abre la ventana
                mathsOperations.setVisible(true);
                hideWindow();
        });
    }

    //método para esconder ventana
    private void hideWindow(){
        this.dispose();
    }
}

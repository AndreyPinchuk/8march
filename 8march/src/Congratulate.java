import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Congratulate extends JFrame {

    private JButton button = new JButton("Далее");
    private JTextField input = new JTextField("");
    private JLabel label = new JLabel("Введите пожалуйста свое имя:");


    public Congratulate() {
        super("Открыточка");
        this.setBounds(200, 200, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(input);
        button.addActionListener(new ButtonEvent());
        container.add(button);
    }

    class ButtonEvent implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String message = "С Международным женским днем, " + input.getText() + "! \nПусть весна цветет не только на улице, но и в душе, \nA твоя красота радует всех окружающих. \nСчастья тебе, благополучия и гармонии. \nЖелаю, чтобы все твои дни были солнечными, яркими и запоминающимися, \nчтобы в твоем доме всегда было уютно и тепло. \nПусть в твоей жизни всё будет так, как ты сама захочешь!\n\n";
            message += "______d$$$$b_d$$$$$b \n" +
                    "_____$$$$$$$$$$$$$$$$$ \n" +
                    "____$$$$$$P_$$$$$$$$$ \n" +
                    "_____V$P_______Y$$P \n" +
                    "___________________d$$b \n" +
                    "___$$$$_________$$$$$$ \n" +
                    "___$$$$$$______$$$$$$$ \n" +
                    "____Y$$$$$$$$$$$$$$$$P \n" +
                    "______Y$P_$$$$$$$ \n" +
                    "__________Y$$$P_$ \n" +
                    "__________________$ \n" +
                    "_________________$ \n" +
                    "_________________$ \n" +
                    "___________________$___$$$$_ \n" +
                    "_________________$__$$$$$$$$ \n" +
                    "__$$$$$$$_______$_$$$$$ \n" +
                    "_$$$$$$$$$_____$$$$$ \n" +
                    "$______$$$$__$ \n" +
                    "________$$_$ \n" +
                    "_________$$$ \n" +
                    "__________$$ \n" +
                    "___________$";
            JOptionPane.showMessageDialog(null, message, "Поздравление!", JOptionPane.PLAIN_MESSAGE);
        }
    }
}

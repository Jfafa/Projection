import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {


    public static void main(String[] args)
    {




        JFrame f = new JFrame();
        f.setSize(400,500);


        JLabel XLabel, YLabel, ZLabel, CLabel, ZeroLebel, PointX, PointY, PointZ;
        XLabel = new JLabel("x + ");
        YLabel = new JLabel("y + ");
        ZLabel = new JLabel("z + ");
        ZeroLebel = new JLabel("=0 ");


        PointX = new JLabel("x = ");
        PointY = new JLabel("y = ");
        PointZ = new JLabel("z = ");


        XLabel.setBounds(50,50, 20,30);
        f.add(XLabel);
        YLabel.setBounds(90, 50, 20,30);
        f.add(YLabel);
        ZLabel.setBounds(130, 50, 20, 30);
        f.add(ZLabel);
        ZeroLebel.setBounds(170, 50, 100, 30);
        f.add(ZeroLebel);


        PointX.setBounds(50, 100, 20, 30);
        PointY.setBounds(100, 100, 20, 30);
        PointZ.setBounds(150, 100, 20, 30);
        f.add(PointX);
        f.add(PointY);
        f.add(PointZ);

        TextField tfx, tfy, tfz, tfx2, tfy2, tfz2, tf, resField;
        tfx = new TextField("");
        tfy = new TextField("");
        tfz = new TextField("");
        tfx2 = new TextField("");
        tfy2 = new TextField("");
        tfz2 = new TextField("");
        tf = new TextField("");
        resField = new TextField("Result");


        tfx.setBounds(30,50, 20,20);
        f.add(tfx);

        tfy.setBounds(70,50, 20,20);
        f.add(tfy);

        tfz.setBounds(110,50, 20,20);
        f.add(tfz);

        tf.setBounds(150,50, 20,20);
        f.add(tf);


        // next param
        tfx2.setBounds(70, 100, 30, 30);
        f.add(tfx2);

        tfy2.setBounds(120, 100, 30, 30);
        f.add(tfy2);

        tfz2.setBounds(170, 100, 30, 30);
        f.add(tfz2);

        resField.setBounds(100, 270, 200, 50);
        f.add(resField);


        JButton countButton;
        countButton = new JButton("Count");
        countButton.setBounds(150, 200, 95, 30);
        f.setSize(400,400);
        f.add(countButton);


        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder str = new StringBuilder("");
                float a, b, c , k, x1, y1, z1, t, x, y, z;
                try {
                    a = Float.parseFloat(tfx.getText());
                    x1 = Float.parseFloat(tfx2.getText());
                    b = Float.parseFloat(tfy.getText());
                    y1 = Float.parseFloat(tfy2.getText());
                    c = Float.parseFloat(tfz.getText());
                    z1 = Float.parseFloat(tfz2.getText());
                    k = Float.parseFloat(tf.getText());



                    t = (-a * x1 - b * y1 - c * z1 - k) / (a*a + b * b + c * c);
                    x = a * t + x1;
                    y = b * t + y1;
                    z = c * t + z1;

                    str.append(x);
                    str.append("; ");
                    str.append(y);
                    str.append("; ");
                    str.append(z);
                    resField.setText(String.valueOf(str));
                    str = null;




                }catch (NumberFormatException e1){
                    resField.setText("Wrong input data");
                }catch (IllegalArgumentException g){
                    resField.setText("Division by zero occured");
                }


            }
        });







        f.setLayout(null);
        f.setVisible(true);


    }
}

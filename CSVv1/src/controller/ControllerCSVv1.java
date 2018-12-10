package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModelCSVv1;
import view.ViewCSVv1;
import javax.swing.JOptionPane;
/**
 *
 * @author Yoselin
 */
public class ControllerCSVv1 implements ActionListener {
    
    private final ModelCSVv1 modelCSVv1;
    private final ViewCSVv1 viewCSVv1;

    public ControllerCSVv1(ModelCSVv1 modelCSVv1, ViewCSVv1 viewCSVv1){
        this.modelCSVv1 = modelCSVv1;
        this.viewCSVv1 = viewCSVv1;
        viewCSVv1.Jb_guardar.addActionListener(this);
        viewCSVv1.Jb_nuevo.addActionListener(this);
         
        initView();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewCSVv1.Jb_guardar){
            modelCSVv1.setPath("C:\\Users\\yoselin\\Documents\\CSVv1\\archivo.txt");
            String name = viewCSVv1.Jtf_nombre.getText();
            String email = viewCSVv1.Jtf_email.getText();
           
            System.out.println(email);
            String message="";
            message+=name+","+email+"\n";
            modelCSVv1.setMessage(message);
            modelCSVv1.writeFile(modelCSVv1.getPath(), modelCSVv1.getMessage());
            JOptionPane.showMessageDialog(viewCSVv1, "Mensaje Guardado");
        }else if(e.getSource()==viewCSVv1.Jb_nuevo){
            viewCSVv1.Jtf_email.setText(null);
            viewCSVv1.Jtf_nombre.setText(null);
            
        }
        
    }
    private void initView() {
        viewCSVv1.setTitle("CSVv1");
        viewCSVv1.setResizable(false);
        viewCSVv1.setLocationRelativeTo(null);
        viewCSVv1.setVisible(true);
    } 
    
}


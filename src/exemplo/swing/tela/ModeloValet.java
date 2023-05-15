
package exemplo.swing.tela;

import exemplo.swing.modelo.Valet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloValet extends AbstractTableModel {
    private List<Valet> valets = new ArrayList();
    private DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm");
    
    @Override
    public int getRowCount() {
        return valets.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Valet v = valets.get(rowIndex);
        switch(columnIndex){
            case 0:
                return v.getModelo();
            case 1:
                return v.getPlaca();
            case 2:
                return df.format(v.getEntrada());
            default:
                return "";
        }
    }
    
    @Override
    public String getColumnName(int coluna){
        switch(coluna){
            case 0:
                return "Modelo";
            case 1: 
                return "Placa";
            case 2:
                return "Data Entrada";
            default:
                return "";
        }
    }
    
    public Valet getValet(int linha){
        return valets.get(linha);
    }
    
    public void adicionar(Valet v){
        valets.add(v);
        fireTableRowsDeleted(valets.size() -1, valets.size() -1);
    }
    
    public void remover(Valet v){
        valets.remove(v);
        fireTableRowsDeleted(valets.size() -1, valets.size() -1);
    }
}

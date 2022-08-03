/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.kredit;

/**
 *
 * @author Sigma
 */
public class ComboItem {
     private String value;
    private String label;

    public ComboItem(String value, String label) {
        this.value = value;
        this.label = label;
    }

    ComboItem(Integer id, String nama) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getValue() {
        return this.value;
    }

    public String getLabel() {
        return this.label;
    }

    @Override
    public String toString() {
        return label;
    }
}


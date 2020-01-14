/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.upil.models;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import pbo.upil.entities.Kandidat;

/**
 *
 * @author Agung Nurhamidan
 */
public class TableKandidatModel extends AbstractTableModel  {
    private List<Kandidat> list = new ArrayList<>();

    public void setList(List<Kandidat> list) {
        this.list = list;
    }

    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    public boolean add(Kandidat e) {
        try {
            return list.add(e);
        } finally {
            fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
        }
    }

    public Kandidat get(int index) {
        return list.get(index);
    }

    public Kandidat set(int index, Kandidat element) {
        try {
            return list.set(index, element);
        } finally {
            fireTableRowsUpdated(index, index);
        }
    }

    public Kandidat remove(int index) {
        try {
            return list.remove(index);
        } finally {
            fireTableRowsDeleted(index, index);
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0 : return "Nomor Kandidat";
            case 1 : return "Nama Kandidat";
            default: return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 : return list.get(rowIndex).getNomorKandidat();
            case 1 : return list.get(rowIndex).getNama();
            default: return null;
        }
    }
    
}

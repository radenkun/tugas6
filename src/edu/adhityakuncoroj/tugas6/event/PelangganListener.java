/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.adhityakuncoroj.tugas6.event;

import edu.adhityakuncoroj.tugas6.entity.Pelanggan;
import edu.adhityakuncoroj.tugas6.model.PelangganModel;

/**
 *
 * @author RadenKun
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);
}

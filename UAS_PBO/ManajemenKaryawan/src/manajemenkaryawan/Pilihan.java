/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manajemenkaryawan;
import java.util.*;
/**
 *
 * @author user
 */
abstract public class Pilihan {
    public ArrayList karyawan = new ArrayList();
    abstract ArrayList proses();
    abstract void lihatPilihan();
    
}

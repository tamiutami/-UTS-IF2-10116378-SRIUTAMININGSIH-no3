/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10116378.sriutaminingsih.no3;

/**
 *
 * @author Regno
 */
public class Metal extends HardRock implements HeavyMetal{
    public void genreMetal(String artistName) {
        System.out.println(artistName+" adalah musisi Metal");
    }

    @Override
    public void genreHeavyMetal(String artistName) {
        System.out.println(artistName+" adalah musisi Heavy Metal");
    }

    @Override
    public void genrePunk(String artistName) {
        System.out.println(artistName+" adalah musisi Punk");
    }

    public void genreGrunge(String artistName) {
        System.out.println(artistName+" adalah musisi Grunge");
    }

    void setartistName(String mxpx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

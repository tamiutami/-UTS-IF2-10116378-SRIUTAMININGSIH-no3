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
public class HardRock extends Rnb implements PopRock,ProgressiveRock,PsychedelicRock{

    public void genreHardRock(String artistName) {
        System.out.println(artistName+" adalah musisi HardRock");
    }

    @Override
    public void genrePsychedelicRock(String artistName) {
        System.out.println(artistName+" adalah musisi PsychedelicRock");
    }

    @Override
    public void genrePopRock(String artistName) {
        System.out.println(artistName+" adalah musisi PopRock");
    }

    @Override
    public void genreProgressiveRock(String artistName) {
        System.out.println(artistName+" adalah musisi ProgressiveRock");
    }

    void setartistName(String dreamTheater) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

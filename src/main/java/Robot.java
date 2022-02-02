public class Robot {
    private int vie;
    private String nom;

    /**
     * @param nom
     *  initialise un robot avec le nom $nom
     */
    Robot(String nom){
        if(nom.equals("")){
            System.out.println("vous devez entrez un nom valide");
            System.exit(1);
        }
        this.nom = nom;
        this.vie = 10;
    }

//recuperation du nom du robot
    public String getNom() {
        return nom;
    }
//recuperation du nombre de vie du robot
    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private String name;
    private List<Piatti> PiattiCollection;
    private List<Bevande> BevandeCollection;


    public Restaurant(String name, String[] piatti, String[] bevande) {
        this.name = name;
        this.PiattiCollection = new ArrayList<>();
        for (String p : piatti) {
            this.PiattiCollection.add(new Piatti(p, 0, new String[]{}));
        }
        this.BevandeCollection = new ArrayList<>();
        for (String b : bevande) {
            this.BevandeCollection.add(new Bevande(b, 0));
        }
    }


    public void stampamenu() {
        System.out.println("Benvenuto al ristorante " + name);
        System.out.println("I nostri piatti sono:");
        for (Piatti p : PiattiCollection) {
            System.out.println(p.getNome() + " - " + p.getPrezzo() + " euro");
        }
        System.out.println("Le nostre bevande sono:");
        for (Bevande b : BevandeCollection) {
            System.out.println(b.getNome() + " - " + b.getPrezzo() + " euro");
        }
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getPiattiCollection() {
        return PiattiCollection;
    }

    public void setPiattiCollection(Object piattiCollection) {
        PiattiCollection = (List<Piatti>) piattiCollection;
    }

    public Object getBevandeCollection() {
        return BevandeCollection;
    }

    public void setBevandeCollection(Object bevandeCollection) {
        BevandeCollection = (List<Bevande>) bevandeCollection;
    }

    public double getPrezzo() {
        return 0;
    }

    public String getNome() {
        return null;
    }

    public List<String> getIngredienti() {
        return null;
    }

    public void setIngredienti(List<String> ingredienti) {
    }

    public void aggiungiIngrediente(String ingrediente) {
    }

    public void rimuoviIngrediente(String ingrediente) {
    }

    public void setPrezzo(double prezzo) {
    }

    public void setNome(String nome) {
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);


    }

}

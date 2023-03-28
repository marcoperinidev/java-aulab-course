import java.util.List;

public class Restaurant {

    private String name;
    private Object PiattiCollection;
    private Object BevandeCollection;

    public Restaurant(String name, Object piattiCollection, Object bevandeCollection) {
        this.name = name;
        PiattiCollection = piattiCollection;
        BevandeCollection = bevandeCollection;
    }

    public void stampamenu() {
        System.out.println("Benvenuto al " + name);
        System.out.println("I nostri piatti sono:");
        System.out.println(PiattiCollection);
        System.out.println("Le nostre bevande sono:");
        System.out.println(BevandeCollection);
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
        PiattiCollection = piattiCollection;
    }

    public Object getBevandeCollection() {
        return BevandeCollection;
    }

    public void setBevandeCollection(Object bevandeCollection) {
        BevandeCollection = bevandeCollection;
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



}

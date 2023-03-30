import java.util.ArrayList;
import java.util.List;

public class Menu {
    @SuppressWarnings("unused")
    private final List<Piatti> piatto;

    public Menu() {
        this.piatto = new ArrayList<>();
    }

    public void addPiatto(Piatti piatto) {
        piatto.add(piatto);
    }


    public void stampaMenu() {
        System.out.println("Menu:");
        for (Piatti piatto : this.piatto) {
            System.out.println(piatto.getNome() + " - " + piatto.getPrezzo() + " euro");
        }
    }
}

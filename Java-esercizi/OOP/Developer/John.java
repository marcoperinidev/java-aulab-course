public class John {
    private String name;
    private int age;
    private String[] programmingLanguages = new String[]{"Java", "C++", "C#", "Python", "JavaScript"};
    private String coffeeBreak;
    private String yearsOfExperience;

    public John(String name, int age, String[] programmingLanguages, String coffeeBreak) {
        setName(name);
        this.age = age;
        setProgrammingLanguages(programmingLanguages);//setter
        this.coffeeBreak = coffeeBreak;
        this.yearsOfExperience = "0 years"; //inizialmente impostato a 0
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getProgrammingLanguages() {
        String pl = "I linguaggi che conosco sono: ";
        for (int i = 0; i < programmingLanguages.length; i++) {
            pl += programmingLanguages[i] + " ";

        }
        return pl;
    }

    private void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public String getCoffeeBreak() {
        return coffeeBreak;
    }

    private void setCoffeeBreak(String coffeeBreak) {
        this.coffeeBreak = coffeeBreak;
    }


    public String getExperience() {
        int years = age - 20; // calcola gli anni di esperienza in modo approssimato (assumendo che abbia iniziato a programmare a 20 anni)
        int coffeeBreaks = coffeeBreak.split(" ").length; // conta il numero di pause caffè
        years += coffeeBreaks; // aggiungi il numero di pause caffè agli anni di esperienza
        return years + " years";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof John)) return false;
        John john = (John) o;
        if (getAge() != john.getAge()) return false;
        if (!getName().equals(john.getName())) return false;
        String pl1 = getProgrammingLanguages();
        String pl2 = john.getProgrammingLanguages();
        if (pl1.length() != pl2.length()) return false;
        if(!pl1.equals(pl2)) return false;
        return getCoffeeBreak().equals(john.getCoffeeBreak());
    }
}

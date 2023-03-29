public class Pointer3D {
    public int x;
    public int y;
    public int z;

    public Pointer3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //? Annotation -> una informazione al compilatore
    @Override
    public boolean equals(Object obj){ //? verranno accettati tutti gli oggetti -> perché tutti gli oggetti sono di classe che ereditano da Object
        //! 1. due oggrtti sono uguali se sono lo hanno lo stesso riferimento
        if(this == obj) return true;
        //! 2. due oggetti sono SICURAMENTE DIVERSI se hanno classi differenti, se uno dei due è null
        if(obj == null || this.getClass() != obj.getClass()) return false;

        //! 3. se sono arrivato fin qui vuol dire che obj è != null ed è di classe Pointer3D
        Pointer3D other = (Pointer3D) obj;
        if(this.x == other.x &&
            this.y == other.y &&
            this.z == other.z) return true;

        return false;

    }
}

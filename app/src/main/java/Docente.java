import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "docente")
public class Docente {
    @ColumnInfo(name = "usuario")
    @PrimaryKey
    public String Usuario;
    @ColumnInfo(name = "nombre")
    public String Nombre;
    @ColumnInfo(name = "apellido")
    public String Apellido;
    @ColumnInfo(name = "telefono")
    public String Telefono;
    public String getDocente(){
        return this.Nombre+ " " + this.Apellido;
    }

    @Entity(tableName = "estudainte")
    public class Estudiante {
        @ColumnInfo(name = "idestudiante")
        @PrimaryKey
        public String idestudiante;
        @ColumnInfo(name = "nombre")
        public String nombre;
        @ColumnInfo(name = "contraseña")
        public String contraseña;
    }

    @Entity(tableName = "materia")
    public class Materia {
        @ColumnInfo(name = "idmateria")
        @PrimaryKey
        public String idmateria;
        @ColumnInfo(name = "nombre")
        public String mombre;
    }

    @Entity(tableName = "examen")
    public class Examen {
        @ColumnInfo(name = "idexamen")
        @PrimaryKey
        public String idexamen;
        @ColumnInfo(name = "estudiante")
        public String estudiante;
        @ColumnInfo(name = "pregunta")
        public String pregunta;
    }

    @Entity(tableName = "pregunta")
    public class Pregunta {
        @ColumnInfo(name = "idpregunta")
        @PrimaryKey
        public String idpregunta;
        @ColumnInfo(name = "enunciado")
        public String enunciado;
        @ColumnInfo(name = "numopciones")
        public String numopciones;
        @ColumnInfo(name = "materia")
        public String materia;
    }
}

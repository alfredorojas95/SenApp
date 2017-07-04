package estructura;

import com.example.alfredo.senapp.R;

import java.util.ArrayList;

/**
 * Created by wilfr on 05-06-2017.
 */

public class Diccionario {

    private ArrayList<Palabra> palabras;

    public Diccionario (){
        this.palabras = new ArrayList<Palabra>();
    }

    public void addPalabra(Palabra palabra){
        this.palabras.add(palabra);
    }

    public ArrayList<Palabra> initPalabras(){

        //A
        palabras.add(new Palabra( R.drawable.abandonar,"Abandonar","Verbo", "1.- Dejar, desamparar a una persona o cosa. \n 2.- Dejar alguna cosa ya iniciada."));
        palabras.add(new Palabra( R.drawable.abril,"Abril","Mes", "Cuarto mes del año que consta de treinta días y en el que comienza la caída de las hojas de los árboles."));
        palabras.add(new Palabra( R.drawable.abanicar,"Abanicar","Verbo", "Echar o echarse aire con un abanico."));
        palabras.add(new Palabra( R.drawable.abrazar,"Abrazar","Verbo pleno", "Estrechar entre los brazos en señal de cariño."));
        palabras.add(new Palabra( R.drawable.agosto,"Agosto","Mes", "Octavo mes del año que tiene treinta y un días. En Chile, es invierno."));
        palabras.add(new Palabra( R.drawable.aburrirse,"Aburrirse","Tiempo", "Cansarse de alguna cosa, tomarle tedio."));
        palabras.add(new Palabra( R.drawable.anteayer,"Anteayer","Tiempo", "El día inmediatamente anterior al de ayer."));
        palabras.add(new Palabra( R.drawable.antes,"Antes","Tiempo", "Indica tiempo pasado."));
        //B
        palabras.add(new Palabra( R.drawable.bonito,"Bonito","Adjetivo", " Lindo, agraciado, de cierta proporción y belleza."));
        palabras.add(new Palabra( R.drawable.bueno,"Bueno","Adjetivo", "Acto en que, abriendo la boca, se inspira lenta y profundamente, luego se espira también lentamente y generalmente con ruido. Es indicio de sueño, aburrimiento o debilidad."));
        //C
        palabras.add(new Palabra( R.drawable.casa,"Casa","Sustantivo", "Construcción para habitar."));
        palabras.add(new Palabra( R.drawable.cambiar,"Cambiar","mano hacía abajo", "Modificar el estado de algo o de alguien."));
        palabras.add(new Palabra( R.drawable.conversar,"Conversar","Verbo", "Dos o más personas se comunican a través de la lengua de señas o en forma oral."));
        palabras.add(new Palabra( R.drawable.clima,"Clima","Verbo", "Estado del ambiente, según la temperatura y la humedad, y de cómo se encuentra el cielo."));
        //D
        palabras.add(new Palabra( R.drawable.dentista,"Dentista","Mes", "Profesional que se dedica al cuidado de la salud de los dientes de las personas."));
        palabras.add(new Palabra( R.drawable.despues,"Después","mano hacía abajo", "Que denota posterioridad de tiempo, lugar o situación."));
        palabras.add(new Palabra( R.drawable.diciembre,"Diciembre","Mes", "Décimo mes del año. Tiene treinta y un días."));
        palabras.add(new Palabra( R.drawable.dia,"Día","mano hacía abajo", "Tiempo que dura 24 horas. Tiempo que dura la claridad del sol sobre el horizonte."));
        palabras.add(new Palabra( R.drawable.dificil,"Dificil","Verbo", "Que se logra, ejecuta o entiende con mucho trabajo.\n"));
        palabras.add(new Palabra( R.drawable.domingo,"Domingo","Verbo", "Séptimo día de la semana."));
        palabras.add(new Palabra( R.drawable.dentista,"Dentista","Profesión", "Profesional que se dedica al cuidado de la salud de los dientes de las personas."));
        //E
        palabras.add(new Palabra( R.drawable.enfermero,"Enfermero","Profesión", "Persona que trabaja en la asistencia a los enfermos, generalmente en hospitales."));
        palabras.add(new Palabra( R.drawable.edificio,"Edificio","Sustantivo", "Obra construida, de más de dos pisos, para habitar o para otros usos como oficinas, teatro, cine, etc."));
        palabras.add(new Palabra( R.drawable.escuela,"Escuela","Sustantivo", "Establecimiento donde se da a los niños, jóvenes o adultos, instrucción en la enseñanza primaria."));
        palabras.add(new Palabra( R.drawable.enero,"Enero","Mes", "Primer mes del año, tiene treinta y un días."));
        palabras.add(new Palabra( R.drawable.ensenar,"Enseñar","Verbo","Instruir a través de métodos que permiten a otros adquirir ciertos conocimientos, principios o ideas."));
        palabras.add(new Palabra( R.drawable.escribir,"Escribir","Verbo","Representar las palabras o las ideas con letras u otros signos trazados en papel u otra superficie."));
        //F
        palabras.add(new Palabra( R.drawable.faltar,"Faltar","mano hacía abajo","No haber algo que debiera existir."));
        palabras.add(new Palabra( R.drawable.febrero,"Febrero","mano hacía abajo","Segundo mes del año que en los años comunes tiene veintiocho días y en los bisiestos veintinueve."));
        palabras.add(new Palabra( R.drawable.fecha,"Fecha","mano hacía abajo","Indicación del número del día, en el mes y año correspondiente."));
        palabras.add(new Palabra( R.drawable.feo,"Feo","Adjetivo","Que carece de belleza y hermosura. Conductas inadecuadas, no correctas."));
        palabras.add(new Palabra( R.drawable.facil,"Fácil","Adjetivo","Que se puede hacer sin gran esfuerzo."));
        palabras.add(new Palabra( R.drawable.feliz,"Feliz","Adjetivo","Que tiene felicidad."));
        //H
        palabras.add(new Palabra( R.drawable.hoy,"Hoy","mano hacía abajo","Día actual en el presente."));
        palabras.add(new Palabra( R.drawable.hacer,"Hacer","Verbo","Producir, realizar una cosa."));
        palabras.add(new Palabra( R.drawable.hablar,"Hablar","mano hacía abajo","Verbo de concordancia."));
        //I
        palabras.add(new Palabra( R.drawable.ir,"Ir","mano hacía abajo",""));
        palabras.add(new Palabra( R.drawable.ingeniero,"Ingeniero","Profesión","Profesional que se ocupa de la ciencia de la proyección y construcción de obras y trabajos públicos."));
        palabras.add(new Palabra( R.drawable.instructor,"Instructor","mano hacía abajo","Persona que imparte su conocimiento a otros."));
        palabras.add(new Palabra( R.drawable.instituto,"Instituto","Sustantivo","Edificio en que funciona alguna corporación educacional."));
        //J
        palabras.add(new Palabra( R.drawable.jueves,"Jueves","Día de la semana","Cuarto día de la semana civil."));
        palabras.add(new Palabra( R.drawable.jugar,"Jugar","mano hacía abajo","Hacer algo con alegría y con el solo fin de entretenerse o divertirse."));
        palabras.add(new Palabra( R.drawable.junio,"Julio","Mes","Sexto mes del año; tiene treinta días."));
        palabras.add(new Palabra( R.drawable.julio,"Junio","Mes","Séptimo mes del año; tiene treinta y un días."));
        //L
        palabras.add(new Palabra( R.drawable.leer,"Leer","mano hacía abajo","Interpretar un texto escrito o impreso a partir de la percepción de los signos gráficos, para comprenderlo."));
        palabras.add(new Palabra( R.drawable.llamar,"Llamar","mano hacía abajo","Realizar gestos para que alguien venga."));
        palabras.add(new Palabra( R.drawable.llorar,"Llorar","Adjetivo","Derramar lágrimas."));
        palabras.add(new Palabra( R.drawable.lunes,"Lunes","Día de la semana","Primer día de la semana civil."));
        //M
        palabras.add(new Palabra( R.drawable.manana,"Mañana","mano hacía abajo","El día que seguirá inmediatamente al de hoy."));
        palabras.add(new Palabra( R.drawable.miercoles,"Miercoles","Día de la semana","Tercer día de la semana civil."));
        palabras.add(new Palabra( R.drawable.mecanico,"Mecánico","mano hacía abajo","Persona dedicada al manejo y al arreglo de máquinas."));
        palabras.add(new Palabra( R.drawable.madrugada,"Madrugada","mano hacía abajo","Resplandor del día que anuncia la salida del sol."));
        palabras.add(new Palabra( R.drawable.marzo,"Marzo","Mes","Tercer mes del año, tiene treinta y un días."));
        palabras.add(new Palabra( R.drawable.mayo,"Mayo","Mes","Vehículo de dos ruedas con motor, con uno o dos asientos."));
        palabras.add(new Palabra( R.drawable.mirar,"Mirar","mano hacía abajo","Atender por medio del sentido de la vista a algo."));
        palabras.add(new Palabra( R.drawable.malo,"Malo","Adjetivo","Que carece de bondad."));
        palabras.add(new Palabra( R.drawable.martes,"Martes","Día de la semana","Segundo día de la semana civil."));
        //N
        palabras.add(new Palabra( R.drawable.noviembre,"Noviembre","Mes","Undécimo mes del año; tiene treinta días"));
        //O
        palabras.add(new Palabra( R.drawable.octubre,"Octubre","Mes","Décimo mes del año. Tiene treinta y un días."));
        palabras.add(new Palabra( R.drawable.olvidar,"Olvidar","mano hacía abajo","Dejar de tener en la memoria lo que se tenía o debía tener."));
        //P
        palabras.add(new Palabra( R.drawable.pagar,"Pagar","mano hacía abajo","Dar dinero a otra persona para cancelar lo que se debe."));
        palabras.add(new Palabra( R.drawable.poco,"Poco","Adjetivo","Escaso, limitado en cantidad o calidad."));
        palabras.add(new Palabra( R.drawable.profesor,"Profesor","mano hacía abajo","Persona que ejerce docencia en distintas ciencias o artes."));
        palabras.add(new Palabra( R.drawable.papa,"Papá","Familia","Varón que ha engendrado a sus hijos."));
        //R
        palabras.add(new Palabra( R.drawable.romper,"Romper","mano hacía abajo","Separar de manera brusca o violenta las partes de un todo."));
        palabras.add(new Palabra( R.drawable.robar,"Robar","mano hacía abajo","Apoderarse con fuerza y violencia de las cosas de otro."));
        //S
        palabras.add(new Palabra( R.drawable.septiembre,"Septiembre","Mes","Noveno mes del año, tiene treinta días."));
        palabras.add(new Palabra( R.drawable.sabado,"Sábado","Día de la semana","Sexto día de la semana civil."));
        //T
        palabras.add(new Palabra( R.drawable.tiempo,"Tiempo","mano hacía abajo","Indicación de un momento exacto."));
        palabras.add(new Palabra( R.drawable.triste,"Triste","Adjetivo","Alguien que se muestra afligido, apesadumbrado."));
        //U
        palabras.add(new Palabra( R.drawable.universidad,"Universidad","Sustantivo","Institución de enseñanza superior que comprende diversas facultades y que confiere grados académicos y títulos profesionales."));
        //V
        palabras.add(new Palabra( R.drawable.viernes,"Viernes","Día de la semana","Quinto día de la semana civil."));
        palabras.add(new Palabra( R.drawable.verdad,"Verdad","Adjetivo","Conformidad entre lo que se dice con lo que se siente o piensa."));

        return palabras;
    }
}

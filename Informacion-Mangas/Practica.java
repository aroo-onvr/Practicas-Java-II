import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Practica extends JFrame {
    private final JLabel informacionJLabel;
    private final JLabel imagenJLabel;
    private final JComboBox<String> shonenJComboBox;
    private final JComboBox<String> seinenJComboBox;
    private final JComboBox<String> shojoJComboBox;
    private final JComboBox<String> spokonJComboBox;
    private final JComboBox<String> clasicosJComboBox;

    private static final String shonen[] = {
        "Onepc.jpg", "DragonBall.png", "Naruto.jpg",
        "KimetsunoYaiba.jpg", "JujutsuKaisen.jpg"
    };

    private static final String seinen[] = {
        "Golgo13.jpg", "Berserk.jpg", "SingekinoKyojin.jpg",
        "Monster.jpg", "Akira.jpg"
    };

    private static final String shojo[] = {
        "Nana.jpg", "KiminiTodoke.jpg", "AoHaruRide.jpg",
        "FruitsBasket.jpg", "CardCaptorSakura.jpg"
    };

    private static final String spokon[] = {
        "SlamDunk.jpg", "Haikyuu.jpg", "CaptainTsubasa.jpg",
        "Bluelock.jpg", "HajimeNoIppo.jpg"
    };

    private static final String clasicos[] = {
        "Doraemon.jpg", "DetectiveConan.jpg", "DeathNote.jpg",
        "JojosBizarreAdventure.jpg", "FullMetalAlchemist.jpg"
    };

    private static final String informacionshonen[] = {
        "One Piece es un manga de aventuras y accion que sigue la historia de Monkey D. Luffy y su tripulacion en busca del tesoro legendario conocido como One Piece.",
        "Dragon Ball es un manga de accion y artes marciales que sigue las aventuras de Goku y sus amigos mientras buscan las esferas del dragon y enfrentan a poderosos enemigos.",
        "Naruto es un manga de accion y aventuras que sigue la historia de Naruto Uzumaki, un joven ninja que busca reconocimiento y suena con convertirse en el Hokage de su aldea.",
        "Kimetsu no Yaiba es un manga de accion y fantasia que sigue la historia de Tanjiro Kamado, un joven que se convierte en cazador de demonios para vengar a su familia y salvar a su hermana.",
        "Jujutsu Kaisen es un manga de accion y sobrenatural que sigue la historia de Yuji Itadori, un estudiante que se une a una escuela de hechiceria para luchar contra maldiciones y proteger a la humanidad."
    };

    private static final String informacionseinen[] = {
        "Golgo 13 es un manga de accion y espionaje que sigue la historia de Duke Togo, un asesino a sueldo altamente calificado que lleva a cabo misiones peligrosas en todo el mundo.",
        "Berserk es un manga de fantasia oscura que sigue la historia de Guts, un guerrero marcado por la tragedia, mientras lucha contra fuerzas demoniacas y busca venganza en un mundo brutal y despiadado.",
        "Shingeki no Kyojin es un manga de accion y fantasia que sigue la historia de Eren Jaeger y sus amigos mientras luchan contra gigantes devoradores de humanos en un mundo postapocaliptico.",
        "Monster es un manga de suspense y thriller psicologico que sigue la historia del Dr. Kenzo Tenma, un neurocirujano que se ve envuelto en una serie de asesinatos y conspiraciones mientras busca detener a un asesino en serie.",
        "Akira es un manga de ciencia ficcion y cyberpunk que sigue la historia de Kaneda y Tetsuo, dos amigos que se ven envueltos en un experimento gubernamental que desata poderes psiquicos destructivos en una ciudad postapocaliptica."
    };

    private static final String informacionshojo[] = {
        "Nana es un manga de romance y drama que sigue la historia de dos chicas llamadas Nana que se encuentran por casualidad y desarrollan una profunda amistad mientras persiguen sus suenos en Tokio.",
        "Kimi ni Todoke es un manga de romance y comedia que sigue la historia de Sawako Kuronuma, una chica timida y malinterpretada, mientras navega por la vida escolar y el amor.",
        "Ao Haru Ride es un manga de romance y drama que sigue la historia de Futaba Yoshioka, una chica que intenta reencontrarse con su primer amor mientras lidia con los cambios de la adolescencia.",
        "Fruits Basket es un manga de romance y fantasia que sigue la historia de Tohru Honda, una chica huerfana que descubre que la familia Soma esta maldita y se transforma en animales del zodiaco chino.",
        "Card Captor Sakura es un manga de magia y aventura que sigue la historia de Sakura Kinomoto, una chica que accidentalmente libera un conjunto de cartas magicas y debe recuperarlas para evitar el caos."
    };

    private static final String informacionspokon[] = {
        "Slam Dunk es un manga de deportes y comedia que sigue la historia de Hanamichi Sakuragi, un estudiante de secundaria que se une al equipo de baloncesto para impresionar a una chica y descubre su pasion por el deporte.",
        "Haikyuu es un manga de deportes y comedia que sigue la historia de Shoyo Hinata, un joven voleibolista que suena con convertirse en un gran jugador a pesar de su baja estatura.",
        "Captain Tsubasa es un manga de deportes y futbol que sigue la historia de Tsubasa Ozora, un talentoso joven futbolista que aspira a jugar profesionalmente y llevar a Japon a la gloria en el futbol.",
        "Blue Lock es un manga de deportes y futbol que sigue la historia de Yoichi Isagi, un delantero que participa en un programa de entrenamiento intensivo para convertirse en el mejor delantero del mundo.",
        "Hajime no Ippo es un manga de deportes y boxeo que sigue la historia de Ippo Makunouchi, un joven timido que descubre su talento para el boxeo y lucha por convertirse en campeon."
    };

    private static final String informacionclasicos[] = {
        "Doraemon es un manga de ciencia ficcion y comedia que sigue la historia de Nobita, un nino torpe, y su amigo robot del futuro, Doraemon, mientras viven aventuras y resuelven problemas con la ayuda de gadgets futuristas.",
        "Detective Conan es un manga de misterio y crimen que sigue la historia de Shinichi Kudo, un joven detective que es transformado en un nino y adopta el alias de Conan Edogawa mientras resuelve casos y busca al responsable de su transformacion.",
        "Death Note es un manga de suspense y sobrenatural que sigue la historia de Light Yagami, un estudiante que encuentra un cuaderno con el poder de matar a cualquier persona cuyo nombre escriba en el, y su enfrentamiento con el detective L.",
        "JoJo's Bizarre Adventure es un manga de accion y aventura que sigue la historia de la familia Joestar a lo largo de varias generaciones mientras luchan contra enemigos sobrenaturales y desarrollan habilidades unicas conocidas como Stands.",
        "Fullmetal Alchemist es un manga de fantasia y aventura que sigue la historia de los hermanos Edward y Alphonse Elric, quienes buscan la Piedra Filosofal para restaurar sus cuerpos despues de un fallido experimento de alquimia."
    };

    private Icon cargarImagen(String carpeta, String nombre) {
        return new ImageIcon(getClass().getResource("/assets/"+ carpeta + "/" + nombre));
    }
    private final Icon[] iconos = {
        cargarImagen("shonen", shonen[0]),
        cargarImagen("shonen", shonen[1]),
        cargarImagen("shonen", shonen[2]),
        cargarImagen("shonen", shonen[3]),
        cargarImagen("shonen", shonen[4]),

        cargarImagen("seinen", seinen[0]),
        cargarImagen("seinen", seinen[1]),
        cargarImagen("seinen", seinen[2]),
        cargarImagen("seinen", seinen[3]),
        cargarImagen("seinen", seinen[4]),

        cargarImagen("shojo", shojo[0]),
        cargarImagen("shojo", shojo[1]),
        cargarImagen("shojo", shojo[2]),
        cargarImagen("shojo", shojo[3]),
        cargarImagen("shojo", shojo[4]),

        cargarImagen("spokon", spokon[0]),
        cargarImagen("spokon", spokon[1]),
        cargarImagen("spokon", spokon[2]),
        cargarImagen("spokon", spokon[3]),
        cargarImagen("spokon", spokon[4]),

        cargarImagen("clasicos", clasicos[0]),
        cargarImagen("clasicos", clasicos[1]),
        cargarImagen("clasicos", clasicos[2]),
        cargarImagen("clasicos", clasicos[3]),
        cargarImagen("clasicos", clasicos[4])
    };

    public Practica() {
        super("Informacion Mangas");
        setLayout(new FlowLayout());

        shonenJComboBox = new JComboBox<String>(shonen);
        shonenJComboBox.insertItemAt("Shonen", 0);
        shonenJComboBox.setSelectedIndex(0);
        shonenJComboBox.setMaximumRowCount(6);

        seinenJComboBox = new JComboBox<String>(seinen);
        seinenJComboBox.insertItemAt("Seinen", 0);
        seinenJComboBox.setSelectedIndex(0);
        seinenJComboBox.setMaximumRowCount(6);

        shojoJComboBox = new JComboBox<String>(shojo);
        shojoJComboBox.insertItemAt("Shojo", 0);
        shojoJComboBox.setSelectedIndex(0);
        shojoJComboBox.setMaximumRowCount(6);

        spokonJComboBox = new JComboBox<String>(spokon);
        spokonJComboBox.insertItemAt("Spokon", 0);
        spokonJComboBox.setSelectedIndex(0);
        spokonJComboBox.setMaximumRowCount(6);

        clasicosJComboBox = new JComboBox<String>(clasicos);
        clasicosJComboBox.insertItemAt("Clasicos", 0);
        clasicosJComboBox.setSelectedIndex(0);
        clasicosJComboBox.setMaximumRowCount(6);

        imagenJLabel = new JLabel(iconos[0]);
        informacionJLabel = new JLabel(
            "<html><body style='width:350px'>"
            + informacionshonen[0] + "</body></html>"
        );

        shonenJComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evento) {
                if(evento.getStateChange() == ItemEvent.SELECTED){
                    int indice = shonenJComboBox.getSelectedIndex();

                    if (indice > 0) {
                        actualizarInformacion(indice - 1, informacionshonen);
                    }
                }
            }
        });

        seinenJComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evento) {
                if(evento.getStateChange() == ItemEvent.SELECTED){
                    int indice = seinenJComboBox.getSelectedIndex();

                    if(indice > 0) {
                        actualizarInformacion(indice, informacionseinen);
                    }
                }
            }
        });

        shojoJComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evento) {
                if (evento.getStateChange() == ItemEvent.SELECTED) {
                    int indice = shojoJComboBox.getSelectedIndex();

                    if(indice > 0){
                        actualizarInformacion(indice + 10, informacionshojo);
                    }
                }
            }
        });

        spokonJComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evento) {
                if (evento.getStateChange() == ItemEvent.SELECTED) {
                    int indice = spokonJComboBox.getSelectedIndex();

                    if(indice > 0){
                        actualizarInformacion(indice + 15, informacionspokon);
                
                    }    
                }
            }
        });

        clasicosJComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evento) {
                if (evento.getStateChange() == ItemEvent.SELECTED) {
                    int indice = clasicosJComboBox.getSelectedIndex();

                    if(indice > 0){
                        actualizarInformacion(indice + 20, informacionclasicos);
                    }
                }
            }
        });
        add(shonenJComboBox);
        add(seinenJComboBox);
        add(shojoJComboBox);
        add(spokonJComboBox);
        add(clasicosJComboBox);

        add(imagenJLabel);
        add(informacionJLabel);
    }

    private void actualizarInformacion(int indiceIcono, String[] informacion) {
        imagenJLabel.setIcon(iconos[indiceIcono]);

        int indiceInformacion = indiceIcono % 5;

        informacionJLabel.setText(
            "<html><body style='width:350px'>"
            + informacion[indiceInformacion]
            + "</body></html>"
        );
    }
}
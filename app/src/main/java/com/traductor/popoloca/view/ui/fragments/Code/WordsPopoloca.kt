package com.traductor.popoloca.view.ui.fragments.Code

object WordsPopoloca {

    fun searchWord(search: String): String {

        val token = search.toUpperCase()
        val list = mapOf(
            //UNIVERSO
            "SOL" to "nchaꞌon",
            "LUNA" to "kunithjao",
            "ESTRELLA" to "kunutse",
            "NUBE" to "thjui",
            "PLANETA" to "nunthe",
            //ANIMALES
            "PÁGARO" to "Kunthua",
            "COLIBRÍ" to "kunixian",
            "GORRIÓN" to "kulegua",
            "ÁGUILA" to "kuxranua",
            "BÚHO" to "kunchia",
            "NIDO" to "kakee ba",
            "RANA" to "kusanía",
            "CAMARÓN" to "kuxuanda",
            "PEZ" to "kuchee",
            "TORTUGA" to "kunchentha",
            "MURCIÉLAGO" to "kunchixin niꞌngo",
            "VÍBORA" to "kunchee",
            "COYOTE" to "kundanixra",
            "ZORRILLO" to "kunthakjan",
            "ARDILLA" to "kutsijno",
            "TLACUACHE" to "kunthujin",
            "VENADO" to "kuxijna",
            "ZORRO" to "kuntha",
            "CONEJO" to "kulaano",
            "GATO" to "kumichin",
            "CERDO" to "kukuchi",
            "RATÓN" to "kunchiixin",
            "GALLINA" to "kuchia",
            "GALLO" to "kunthaxichia",
            "GUAJOLOTE" to "kunthaxijno",
            "TOTOLA" to "kunthatula",
            "PATO" to "kupaato",
            "PERRO" to "kunia",
            "CABALLO" to "kunxin",
            "BURRO" to "kulucho",
            "CABRA" to "kutentso",
            "TORO" to "kuxinthaa",
            "BORREGO" to "kuthuchjon",
            "ARAÑA" to "kuthuchje",
            "PIOJO" to "kuche",
            "HORMIGA" to "kuchuka",
            "AVISPA" to "kuxiji",
            "GUSANO" to "kutsindo",
            "MARIPOSA" to "kukapio",
            "ALACRÁN" to "kunthanchia",
            "SALTAMONTES" to "kuxuali",
            //CULTIVOS Y ACCESORIOS DE COSINA
            "MAÍZ" to "nua",
            "MILPA" to "jino",
            "ELOTE" to "thin",
            "MAZORCA" to "nii",
            "OLOTE" to "thujna",
            "NIXTAMAL" to "nune",
            "MASA" to "nchoꞌo",
            "TORTILLA" to "nio",
            "TLAPILE" to "xruthja",
            "METATE" to "xruchri",
            "TEMOLOTE" to "xrujna",
            "CAJETE" to "nithe",
            "HOYA" to "chi",
            "PLATO" to "laato",
            "LUMBRE" to "xruꞌi",
            "MESA" to "nthanetaxin ni",
            "SILLA" to "nthaxintaon",
            "LEÑA" to "niꞌo",
            "TENATE" to "xincha",
            //ROPA
            "ROPA" to "luntho",
            "COMETA" to "kukapalo",
            "BALÓN" to "thulo",
            "SOMBRERO" to "xranchrintja",
            "CALZÓN" to "kacha",
            "COBIJA" to "nuxra",
            "ZAPATO" to "therua",
            "HUARACHES" to "kathe",
            //FRUTAS
            "FRUTA" to "thuchjuin",
            "PLATANO" to "thunthaxraꞌo",
            "PIÑA" to "thusako",
            "LIMÓN" to "thusan",
            "NARANJA" to "thunsan",
            "PITAYA" to "xechjian",
            "TUNA" to "xichre",
            "AGUACATE" to "thunua",
            "FRIJOL" to "jma",
            "CHAYOTE" to "thunchaꞌa",
            "JITOMATE" to "xuthí",
            "CHILE" to "jnayua",
            "PAPA" to "thukja",
            "AJO" to "thuajo",
            "CEBOLLA" to "thujnthi",
            "CALABAZA" to "cho",
            //HERRAMIENTAS
            "MACHETE" to "chia taade",
            "HACHA" to "jaacha",
            "CLAVO" to "chia didoꞌo nthaa",
            "HOZ" to "juso",
            "ARADO" to "ninge",
            "PALA" to "paala",
            "MARTILLO" to "chia dintjaxin ni",
            "HILO" to "jino",
            //PERSONAS
            "BEBE" to "xannchichjan",
            "NIÑO" to "xichjan",
            "NIÑA" to "nchrichjan",
            "JOVEN" to "xaxii",
            "SEÑORITA" to "xanchrii",
            "SEÑOR" to "tathiita",
            "SEÑORA" to "naniita",
            "ABUELO" to "dachrichjan",
            "ABUELA" to "nachrichjan",
            //CUERPO HUMANO
            "CARA" to "ngakon ni",
            "CABELLO" to "xrajaa ni",
            "OREJA" to "ndatsjuen ni",
            "CUELLO" to "thusin ni",
            "HOMBRO" to "nthacheen ni",
            "ESPALDA" to "nthakui ni",
            "BRAZO" to "kulaano raa ni",
            "MANO" to "thja ni",
            "PECHO" to "ntha nthakuin ni",
            "MANO" to "thja ni",
            "CODO" to "nthajuchjiꞌi raa ni",
            "GLÚTEO" to "nthao nda chree ni",
            "MUSLO" to "nthatsao ni",
            "" to "",
            "RODILLA" to "nthajuchjiꞌi ni",
            "PIERNA" to "tseꞌe ruthee ni",
            "PIE" to "ruthee ni",
            "PUÑO" to "thon",
            "CABEZA" to "Jaa ni",
            "FRENTE" to "nthathjen ni",
            "CEJA" to "nthaxrajiꞌin makon ni",
            "PESTAÑA" to "xramakon ni",
            "OJO" to "jmakon ni",
            "NARIZ" to "chinthjo ni",
            "BOCA" to "ruꞌa ni",
            "MENTÓN" to "nthariue ni",
            "UÑAS" to "chingo",
            "MEJILLA" to "nthaajin ngakon ni",
            "LENGUA" to "nejen ni",
            "CEREBRO" to "tjele jaa ni",
            "FARINGE" to "kukue ni",
            "CORAZÓN" to "anseen ni",
            "ESTÓMAGO" to "thujueꞌen ni",
            "HÍGADO" to "ñao ni",
            "INTESTINO" to "tsjejno",
            "DELGADO" to "jno",
            "GRUESO" to "jieto",
            "RIÑÓN" to "chikee ni",
            //ACCIONES
            "HACER" to "ncheꞌe",
            "CORRER" to "jithinga",
            "TOCAR" to "jidinga",
            "CANCIÓN" to "soon",
            "COMER" to "Tene na.",
            "MOLER" to "jidaꞌo",
            "TOMAR" to "jidiꞌi",
            "AGUA" to "jinda",
            "BAÑAR" to "jitsinda",
            "COSER" to "jitjaon",
            "PEINAR" to "jinchijin",
            "VENDER" to "jinchekjin",
            "PISCAR" to "jitanda",
            "CORTAR" to "jidijin",
            "LEÑA" to "niꞌo",
            "TIRAR" to "jithingo",
            "PASTO" to "kachji",
            "SEMBRAR" to "jithenga",
            "PORMEDIAR" to "jitjangiꞌi",
            "BARRER" to "jidajon",
            "REÍR" to "jitjano",
            "LLORAR" to "jitsjanga",
            "TRISTE" to "tajichiin",
            "ENFERMO" to "niꞌi",
            "BRINCAR" to "jichrinka",
            //NUMEROS
            "1" to "naa",
            "2" to "yoo",
            "3" to "nii",
            "4" to "noo",
            "5" to "naꞌo",
            "6" to "inkjaon",
            "7" to "yaato",
            "8" to "jní",
            "9" to "náá",
            "10" to "the",
            "11" to "thejngo",
            "12" to "theyoo",
            "13" to "thenii",
            "14" to "thenoo",
            "15" to "thenaꞌo",
            "16" to "theinkjaon",
            "17" to "theyaato",
            "18" to "thejní",
            "19" to "thenáá",
            "20" to "kan",
            "30" to "kan ko the",
            "40" to "yoo kan",
            "50" to "yoo kan ko the",
            "60" to "nii kan",
            "70" to "nii kan ko the",
            "80" to "noo kan",
            "90" to "noo kan ko the",
            "100" to "naa renkia",
            "1" to "naa",
            "2" to "yoo",
            "3" to "nii",
            "4" to "noo",
            "5" to "naꞌo",
            "6" to "inkjaon",
            "7" to "yaato",
            "8" to "jní",
            "9" to "náá",
            "10" to "the",
            "11" to "thejngo",
            "12" to "theyoo",
            "13" to "thenii",
            "14" to "thenoo",
            "15" to "thenaꞌo",
            "16" to "theinkjaon",
            "17" to "theyaato",
            "18" to "thejní",
            "19" to "thenáá",
            "20" to "kan",
            "30" to "kan ko the",
            "40" to "yoo kan",
            "50" to "yoo kan ko the",
            "60" to "nii kan",
            "70" to "nii kan ko the",
            "80" to "noo kan",
            "90" to "noo kan ko the",
            "100" to "naa renkia",
            "1" to "naa",
            "2" to "yoo",
            "3" to "nii",
            "4" to "noo",
            "5" to "naꞌo",
            "6" to "inkjaon",
            "7" to "yaato",
            "8" to "jní",
            "9" to "náá",
            "10" to "the",
            "11" to "thejngo",
            "12" to "theyoo",
            "13" to "thenii",
            "14" to "thenoo",
            "15" to "thenaꞌo",
            "16" to "theinkjaon",
            "17" to "theyaato",
            "18" to "thejní",
            "19" to "thenáá",
            "20" to "kan",
            "30" to "kan ko the",
            "40" to "yoo kan",
            "50" to "yoo kan ko the",
            "60" to "nii kan",
            "70" to "nii kan ko the",
            "80" to "noo kan",
            "90" to "noo kan ko the",
            "100" to "naa renkia",
            "UNO" to "naa",
            "DOS" to "yoo",
            "TRES" to "nii",
            "CUATRO" to "noo",
            "CINCO" to "naꞌo",
            "SEIS" to "inkjaon",
            "SIETE" to "yaato",
            "OCHO" to "jní",
            "NUEVE" to "náá",
            "DIEZ" to "the",
            "ONCE" to "thejngo",
            "DOCE" to "theyoo",
            "TRECE" to "thenii",
            "CATORCE" to "thenoo",
            "QUINCE" to "thenaꞌo",
            "DIECISÉIS" to "theinkjaon",
            "DIECISIETE" to "theyaato",
            "DIECIOCHO" to "thejní",
            "DIECINUEVE" to "thenáá",
            "VEINTE" to "kan",
            "TREINTA" to "kan ko the",
            "CUARENTA" to "yoo kan",
            "CINCUENTA" to "yoo kan ko the",
            "SESENTA" to "nii kan",
            "SETENTA" to "nii kan ko the",
            "OCHENTA" to "noo kan",
            "NOVENTA" to "noo kan ko the",
            "CIEN" to "naa renkia",
            //Ch

            "DURO" to "cha",
            "CORAZÓN" to "anseen",
            "ALEGRES"  to "chaa na",
            "FELIZES" to "chaa na",
            "ALEGRE" to "cha'a",
            "FELIZ" to "cha'a",
            "RAMA" to "chaan",
            "CHICHARRÓN" to "chalo",
            "COLLAR" to "changi",
            "TELAR" to "chao",
            "PEDIDA" to "cha'o",
            "PETICIÓN" to "cha'o",
            "HONDA" to "charpi",
            "RESORTERA" to "charpi",
            "PICANTE" to "che",
            "BANDIDO" to "che'e",
            "LADRÓN" to "cheꞌe",
            "CIEGO" to "chejo",
            "METAL" to "chia",
            "FIERRO"  to "chia",
            "AGUATE" to "chichao",
            "REFLEJO" to "chiixro",
            "RESPLANDOR" to "chiixro",
            "DISCISIÓN" to "chijni",
            "PLEITO" to "chijni",
            "HEMORROIDES" to "chikin",
            "INFLAMACIÓN" to "chikjan",
            "ENFERMEDAD" to "chin",
            "ALFARECIA" to "chinchjeꞌen",
            "VESTIRSE" to "chinga",
            "CHICLE"  to "chingo",
            "FLECHA" to "chino",
            "NIDO" to "chinthiꞌi",
            "ENCÍA" to "chitangeꞌe",
            "COCERSE" to "chjan",
            "HORNEAR" to "chjan",
            "ASAR" to "chjan",
            "FREÍRSE" to "chjantha",
            "MADURARSE" to "chje",
            "FIAR" to "chje jie",
            "DAR" to "chjee",
            "SUEÑO" to "kothachrin",
            "ROMPERSE" to "chjejin",
            "QUEBRARSE" to "chjejin",
            "DISPERSARSE" to "chjekee",
            "ROTO" to "chjentaon",
            "QUEBRADO" to "chjentaon",
            "SARRO" to "chjiin",
            "CELOSO" to "chjio",
            "DISEÑO" to "chjiꞌni",
            "DIBUJO" to "chjiꞌni",
            "ENVIDIOSO" to "chjoeꞌe",
            "LANA" to "chjon",
            "ESCASO" to "chjonga",
            "ESPERAR" to "choꞌen",
            "PERSONA" to "chojni",
            "GENTE" to "chojni",
            "CACAHUATE" to "chonche",
            "TENER" to "chonda",
            "CALABACITA" to "chondachjan",
            "EXACTAMENTE" to "chongee",
            "PERFECTAMENTE" to "chongee",
            "AFORTUNADO" to "chongeo",
            "SUERTE" to "chongeo",
            "MEDIODÍA" to "chongiixin",
            "CONOCER" to "chonxin",
            //CHR
            "LLENO" to "chre",
            "ESPOSA" to "chriꞌi",
            "BROTAR" to "chriꞌin",
            "LLUVIA" to "chrin",
            "BAJO" to "chringi",
            "REVENTAR" to "tonchintaon",
            "REVENTARSE" to "chrintaon",
            "HIELO" to "chrintha",
            "GRANIZO" to "chrintha",
            "NIEVE" to "chrintha",
            "VIENTO" to "chrintho",
            "AIRE" to "chrintho",
            "BONITO" to "chrjoin",
            "BONITA"  to "chrjoin",
            "DICE" to "chro",
            "JUSTICIA" to "chro jie",
            "DEMANDA" to "chro jie",
            "ACUSAR" to "chro jie",
            "NO QUERER" to "chroꞌa",
            "DIJO" to "chroache",
            "ALGO" to "chroan",
            "NO PODER" to "chrojaꞌa",
            //D
            "SACERDOTE" to "daana",
            "PEDAZOS" to "daaña",
            "SUSPIRAR" to "daaba",
            "ENFRIARSE" to "dabeꞌe",
            "GANAR" to "dacha",
            "ENCIMA" to "dachjejin",
            "VIEJO" to "dachrii",
            "SALIR" to "dachrje",
            "APRETAR" to "dagenixin",
            "APLASTAR" to "dagenixin",
            "EXPRIMIR" to "dagenixin",
            "NUERA" to "dainda",
            "BARRER" to "dajon",
            "TEMPRANO" to "dakao",
            "ALUMBRADO" to "dakaon",
            "ENCENDERSE" to "dakin",
            "ANDAR" to "dakji",
            "PEDIR" to "danchia",
            "ROGAR" to "danchiaga'a",
            "SUPLICAR" to "danchiagaꞌa",
            "PREGUNTAR" to "danchiangi",
            "CRECER" to "dangi",
            "DESARROLLAR" to "dangi",
            "BAJAR" to "dania",
            "TIRAR" to "danka",
            "SOPLAR" to "danothe",
            "ABRIR" to "danthjee",
            "ESCURRIR" to "dasiin",
            "TORCER" to "dasinga",
            "AMONTONAR" to "dasintja",
            "MOJARSE" to "data",
            "MEDIR" to "dathechoꞌa",
            "PASAR" to "datho",
            "CRUZAR" to "datho",
            "NADAR" to "dathongi",
            "RECOGER" to "datse",
            "ALZAR" to "datsiin",
            "EMPACAR" to "datsingathe",
            "COSECHA" to "datsinxin",
            "SACAR" to "dantsje",
            "ARRANCAR" to "dantsjengi",
            "RECONOCER" to "datsoan",
            "FERMENTAR" to "datsoxiꞌin",
            "RECIBIR" to "dayee",
            "TRANSPORTAR" to "dayaa",
            "CARGAR" to "dayaa",
            "ACLARAR" to "dechangi",
            "COMPADRE" to "dechjan",
            "CALZAR" to "dechjanga",
            "GUARDAR" to "dechjian",
            "AMARRAR" to "dechria",
            "FAJARSE" to "dechria",
            "MORIR" to "deꞌen",
            "MENSTRUACIÓN" to "egengi",
            "DORMIRSE" to "dejoa",
            "MANEJAR" to "deka",
            "ALCANZAR" to "dekaxin",
            "MERECER" to "dekininxin",
            "CUIDAR" to "denda",
            "PROTEGER" to "denda",
            "EXPULSAR" to "dengi",
            "MATAR" to "denxon",
            "COLGAR" to "deriaꞌnda",
            "ENCONTRARSE"  to "detan",
            "PONER" to "dethea",
            "ARRODILLARSE" to "dethoxin",
            "ENVOLVER" to "detsaa",
            "PONERSE" to "dexrangi",
            "LLEVAR" to "deyaa",
            "CAERSE" to "detsinga",
            "EMBARAZADA" to "deyaa chjan",
            "QUEMADO" to "diche",
            "BEBER" to "di'i",
            "TOMAR" to "diꞌi",
            "BUSCAR" to "dikjee",
            "LLEGAR" to "diji",
            "TRAER" to "dika",
            "VOLVER" to "dikaan",
            "GOLPEADO" to "dikaon",
            "ROBADO" to "dikee",
            "VER" to "dinkon",
            "COMPRAR" to "dina",
            "HACER" to "dinchian",
            "ESCOGER" to "dinchieꞌe",
            "ENCONTRARSE" to "dinchoe",
            "ENCONTRAR" to "dithja",
            "GUSTAR" to "dindatheꞌe",
            "TOCAR" to "dinga",
            "AMANECER" to "dingasaan",
            "TRAGAR" to "dinnga",
            "LABRAR" to "dinthja",
            "ESPARCIR" to "dinthji",
            "JALAR" to "dinthjian",
            "DISOLVER" to "dinthjingi",
            "SALUDO" to "dio",
            "ENVOLVERSE" to "disia",
            "ESTRANGULAR" to "disingeꞌe",
            "ADELANTE"  to "ditaon",
            "PERDIDO" to "ditjaan",
            "OLVIDADO" to "ditjañeꞌe",
            "COCER" to "ditjoa",
            "CAMBIAR" to "ditoxiꞌin",
            "MEZCLAR" to "dithekjan",
            "OBEDECER" to "dithikaon",
            "CUMPLIR" to "dithja",
            "IGUAL" to "dithja",
            "CORROMPER" to "dithje",
            "ENTRAR" to "dixiꞌin",
            "METERSE" to "dixinthe",
            "ABANDONAR" to "dixintonxin",
            "AMONTINARSE" to "dixroinga",
            "PEGAR" to "doen",
            "UTIL" to "donda",
            "SERVIR" to "donda",
            "LIMPIAR" to "doni",
            "ENOJADO" to "doñao",
            "DETERGENTE" to "faa",
            //F
            "AUTOBUS" to "fleecha",
            //G
            "VIUDO" to "ga'an",
            "VIUDA" to "gaꞌan",
            "GARRAFÓN" to "galoon",
            "FOGÓN" to "giꞌi",
            "COSTAL" to "gosta",
            //I
            "MÁS" to "icha",
            "OTRO" to "ijngo",
            "INYECCIÓN" to "inthisioon",
            "PARA" to "ixin",
            //J
            "DESPUÉS" to "ja",
            "SI" to "jaan",
            "HOY" to "jai",
            "RÁPIDAMENTE" to "jaikoa",
            "CUANTO" to "2jaꞌin",
            "PRONTO" to "jaka",
            "MIRA" to "jalajen",
            "ESCONDIDO" to "jima",
            "BUENO" to "janchee",
            "MADRE" to "janna'a",
            "MAMÁ" to "jannaꞌa",
            "ABUELA" to "jannachriꞌi",
            "SUEGRA" to "jannchee",
            "AMANTE" to "janñaokoa",
            "GUAPO" to "jaro",
            "ATRACTIVO" to "jaro",
            "ROJO" to "jatse",
            "AHORITA" to "jaxon",
            "DIFERENTE" to "jee",
            "SOLAMENTE" to "jeꞌo",
            "MALO" to "jianꞌa",
            "DESPACIO" to "jiao",
            "LLENO" to "jichre",
            "GRANDE" to "jie",
            "ES" to "jii",
            "CERRADO" to "jijee",
            "PEINAR" to "jijin",
            "TIERRA" to "jinche",
            "HUMO" to "jiꞌnchin",
            "COMER" to "jine",
            "DESAYUNAR" to "jine",
            "ALMORZAR" to "jine",
            "CENAR" to "jine",
            "MAR" to "jindanchaon",
            "OCÉANO"  to "jindanchaon",
            "MASCAR" to "jinechje",
            "MASTICAR"  to "jinechje",
            "APROVECHARSE" to "jinekoa",
            "ABUSAR" to "jinekoa",
            "ALTO" to "jini",
            "AGUA" to "jinda",
            "ALTURA" to "jinixin",
            "GRUESOS" to "jinjieto",
            "HAMBRE" to "jintha",
            "SUAVEMENTE" to "jion",
            "CUIDADOSAMENTE" to "jion",
            "CONTENER" to "jiria",
            "CONSEGUIR" to "jirika",
            "INCLINANDO" to "jisee",
            "RELAMPAGUEAR" to "jithongixin",
            "FRIJOL" to "jma",
            "HABA" to "jmaaba",
            "CHICHARO" to "jmatholontsin",
            "CERRO" to "jna",
            "AYER" to "jna",
            "MONTAÑA" to "jnanchaꞌan",
            "CHILE" to "jnayoa",
            "SALSA" to "ndajna",
            "CAMPO" to "jngi",
            "TERRENO" to "jngi",
            "SABROSO" to "jni",
            "SANGRE" to "jni",
            "DELGADO" to "jno",
            "TÍA" to "joaꞌa",
            "PERMISO"  to "joachaxin",
            "PREOCUPACIÓN" to "joachjaon",
            "CANCIÓN" to "joadithjaaña",
            "SALUDO" to "joajna",
            "FAVOR" to "joatotseꞌen ñao",
            "MENTE" to "joarrixaon",
            "FLOJERA" to "joaseꞌe",
            "VERGÜENZA"  to "joasoaxin",
            "BRUJERÍA" to "joathoso",
            "DIVINO" to "joatsoꞌen",
            "CHISTE" to "joaxanda",
            "MIEDO" to "joaxraon",
            "DIVERSIÓN" to "joaxroan",
            "MALACATE" to "jochji",
            "CASCO"  to "jocho",
            "CANSANCIO" to "joachrjen",
            "TERMINÉ" to "joena",
            "GÜERA"  to "joera",
            "TRAJO" to "joiaꞌo",
            "HUEVO" to "joja",
            "ANCIANO" to "jonchjan",
            "CHAROLA" to "jonjni",
            //K
            "HIERBA"  to "ka",
            "CALZÓN" to "kacha",
            "PASTO" to "kachji",
            "GORRA" to "kachocha",
            "MAGUEY" to "kachro",
            "ZÁBILA" to "kachronajni",
            "TAMBIÉN" to "kai",
            "TODO" to "kain",
            "PALMA" to "kajne",
            "EPASOTE" to "kamaxra chjiꞌan",
            "HIERBABUENA" to "kamaxra najni",
            "MIRTO"  to "kamirton",
            "ESPINAS" to "nchaꞌa",
            "ABSOLUTAMENTE" to "kanchesinxon",
            "VERDOLAGA" to "kanchexroa",
            "QUELITE" to "kanchexroakoode",
            "PENCA" to "kanchiixin",
            "PAXTLE" to "kanchrjen",
            "PETATE" to "kania",
            "NOPAL" to "kantha",
            "CHICALOTE" to "kanthachikalo",
            "VARIOS" to "kanxin",
            "CANAL"  to "kaño",
            "RUDA" to "karroda",
            "HUARACHE" to "kathe",
            "PEGAJOSA" to "kathinta",
            "MARRUBIO" to "kathochjee konia",
            "BASURA" to "kaxineno",
            "IXTLE" to "kaxra",
            "OBSTRUIR" to "kayakoeꞌen",
            "AMBOS" to "kayoi",
            "FIESTA" to "kiai",
            "FRÍO" to "kin",
            "TRANSFORMAR" to "kjamanga",
            "CAERSE" to "kjamangi",
            "REGRESAR" to "kjan",
            "PAPÁ" to "ndodaa",
            "TÍO" to "chrinina",
            "HIJA" to "Xanꞌna",
            "HIJO" to "Xanꞌna",
            "HERMANA" to "xichian",
            "HERMANO" to "ichian"

            )

        return if (list[token] != null) {
            list[token].toString()
        } else {
            search
        }
    }


}
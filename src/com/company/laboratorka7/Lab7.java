package com.company.laboratorka7;


import java.util.*;

public class Lab7 {


//    private static final String text =  "В русском тексте каждую букву заменить ее порядковым номером в \n" +
//            "алфавите. При выводе в одной строке печатать текст с двумя\n" +
//            "пробелами между буквами, в следующей строке внизу\n" +
//            "под каждой буквой печатать ее номер.";
//    private static final String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
//
//    private static void printSymbolLine(String line) {
//        for (char symbol : line.toCharArray()) {
//            System.out.print(" " + symbol + " ");
//        }
//        System.out.println();
//    }
//
//    private static void printNumberLine(String line) {
//        int number;
//        for (char sym : line.toCharArray()) {
//            number = alphabet.indexOf(sym);
//            if (number == -1){
//                number = alphabet.toUpperCase(Locale.ROOT).indexOf(sym);
//                if (number == -1){
//                    System.out.print("-- ");
//                    continue;
//                }
//            }
//            System.out.printf("%2d ",(number + 1));
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args){
//        String[] lines = text.split("\\n");
//        for (String line : lines) {
//            line = line.replaceAll("\\s+", "");
//            printSymbolLine(line);
//            printNumberLine(line);
//        }
//
//    }


//    public static void main(String[] args){
//    String text =  "В русском тексте каждую букву заменить ее порядковым номерам в \n" +
//            "алфавите. При выводе в одной строке печатать текст с двумя\n" +
//            "прабелами между буквами, в следующей страке внизу\n" +
//            "под каждой буквой печатать ее номер.";
//    System.out.println(text.replaceAll("ра", "ро"));
//    }


//    public static void main(String[] args){
//        String text =  "В русском тексте каждую букву заменить ее порядковым номерам в \n" +
//            "алфавите. При выводе в одной строке печатать текст с двумя \n" +
//            "прабелами между буквами, в следующей страке внизу \n" +
//            "под каждой буквой печатать ее номер.";
//
//        String [] words = text.toLowerCase().replaceAll("[.?!,\n]", "").split(" ");
//        TreeMap<String, Integer> wordsTreeMap = new TreeMap<>();
//        for (String word : words){
//            Integer number = wordsTreeMap.get(word);
//            if (number == null){
//                number = 0;
//            }
//                number++;
//                wordsTreeMap.put(word, number);
//        }
//        for (String word : wordsTreeMap.keySet()){
//            System.out.println(word + ": " + wordsTreeMap.get(word));
//        }
//
//    }
//
//
//    public static void main(String[] args){
//        String text = """
//                В русском тексте каждую букву заменить ее порядковым номерам в\s
//                алфавите. При выводе в одной строке печатать текст с двумя\s
//                прабелами между буквами, в следующей страке внизу\s
//                под каждой буквой печатать ее номер.""";
//        int n;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите количество символов: ");
//        if (scanner.hasNextInt()) {
//            n = scanner.nextInt();
//        } else {
//            System.out.println("error");
//            n = -1;
//        }
//
//        char[] symbols = text.toLowerCase().replaceAll("[\n\\s]", "").toCharArray();
//        HashMap<Character, Integer> symbolsHashMap = new HashMap<>();
//        for (char sym : symbols){
//            Integer number = symbolsHashMap.get(sym);
//            if (number == null){
//                number = 0;
//            }
//                number++;
//                symbolsHashMap.put(sym, number);
//        }
//        symbolsHashMap.entrySet().stream()
//                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
//                .limit(n).forEach(System.out::println);
//    }
//
//
//    public static void main(String[] args){
//        String text = """
//                В русском текст каждую букву заменить ее порядковым номером в\s
//                алфавите. При выводе в одной строке печатать текст с двумя\s
//                пробелами между буквами, в следующей строке внизу\s
//                по каждой буквой печатать ее номер. Найти предложения\s
//                с повторяющимися словами. текст""";
//        String[] sentences = text.split("\\.");
//        int max = 0, buf;
//        String word_max = "", word_buf;
//        for (String sentence : sentences){
//            String[] words = sentence.toLowerCase(Locale.ROOT).split(" ");
//            for(String word : words){
//                buf = 0;
//                word_buf = word;
//                String[] sentences_eq = text.replace(sentence + "\\.", "").split("\\.");
//                for(String sentence_eq : sentences_eq){
//                    String[] words_eq = sentence_eq.toLowerCase(Locale.ROOT).split(" ");
//                    for(String word_eq : words_eq){
//                        if (word.equals(word_eq)){
//                            buf++;
//                            break;
//                        }
//                    }
//                }
//                if (buf > max){
//                    max = buf;
//                    word_max = word_buf;
//                }
//            }
//        }
//        System.out.println(word_max + ": " + max);
//    }
//
//
//    public static void main(String[] args){
//        String text = """
//                В русском текст каждую букву заменить ее порядковым номером в\s
//                алфавите. При выводе в русском одной строке печатать текст с двумя\s
//                пробелами между буквами, в следующей строке внизу\s
//                по каждой буквой печатать ее номер. Найти предложения\s
//                с повторяющимися словами.""";
//        String[] sentences = text.replaceAll(",", "").split("\\.");
//        String uniq_word = "Таких слов нет", buf;
//        boolean flag = true;
//        String[] words = sentences[0].toLowerCase(Locale.ROOT).split("\\s");
//        sentences[0] = "";
//        for (String word : words){
//            buf = word;
//            for (String sentence : sentences){
//                if (sentence.contains(word)) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag){
//                uniq_word = buf;
//                break;
//            }
//            flag = true;
//        }
//        System.out.println(uniq_word);
//    }
//
//
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите текст:");
//        String text = scanner.nextLine(), buf = " ";
//        while (!(buf.isEmpty())){
//            buf = scanner.nextLine();
//            text += "\n" + buf;
//        }
//        HashMap<String, Integer> wordsHashMap = new HashMap<>();
//        System.out.println("Введите список слов:");
//        buf = scanner.nextLine();
//        while (!(buf.isEmpty())){
//            wordsHashMap.put(buf, 0);
//            buf = scanner.nextLine();
//        }
//        String[] words = text.replaceAll(",", "").split("\\s");
//        for (String word : wordsHashMap.keySet()) {
//            Integer number = wordsHashMap.get(word);
//            for (String text_word : words) {
//                if (Objects.equals(word, text_word)) {
//                    number++;
//                }
//            }
//            wordsHashMap.put(word, number);
//        }
//        wordsHashMap.entrySet().stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
//                .forEach(System.out::println);
//    }
//
//
//
//    public static void main(String[] args){
//        String text = """
//                В русском текст каждую букву заменить ее порядковым номером в\s
//                алфавите. При выводе в русском одной строке печатать текст с двумя\s
//                пробелами между буквами, в следующей строке внизу\s
//                по каждой буквой печатать ее номер. Найти предложения\s
//                с повторяющимися словами.""";
//
//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                String alpha = "аеёиоуэюя";
//                int buf_1, buf_2;
//                if (o1.length() > o2.length()){
//                    return -1;
//                } else if (o1.length() < o2.length()){
//                    return 1;
//                } else{
//                    buf_1 = buf_2 = 0;
//                    for (char sym : o1.toCharArray()){
//                        if (alpha.indexOf(sym) != -1){
//                            buf_1++;
//                        }
//                    }
//                    for (char sym : o2.toCharArray()){
//                        if (alpha.indexOf(sym) != -1){
//                            buf_2++;
//                        }
//                    }
//                    if (buf_1 > buf_2){
//                        return 1;
//                    } else return -1;
//                }
//            }
//        };
//
//        String[] words = text.toLowerCase(Locale.ROOT).replaceAll("[,.\n]","").split("\\s");
//        List<String> words_list = new ArrayList<String>(Arrays.asList(words));
//        words_list.sort(comparator);
//        for (String word : words_list){
//            System.out.println(word);
//        }
//    }
}

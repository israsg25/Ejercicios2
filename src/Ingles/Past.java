package Ingles;

import java.sql.*;
import java.util.Scanner;

public class Past {
    private static final Scanner entrada = new Scanner(System.in);
    static Past past = new Past();

    public static void TimePast() {

        try {
            String url = "jdbc:mysql//localhost:3306/verbs?user=root&password=";
            Connection conectar = DriverManager.getConnection(url);
            Statement statement = conectar.createStatement();
            System.out.println("_________________________________________");
            System.out.println("           ********PAST********");
            System.out.println("Your sentence is active(1) or passive(2) voice: ");
            int sentece = entrada.nextInt();
            //active voice

            if (sentece == 1) { //Active inicio
                System.out.println("_________________________________________");
                System.out.println("            Active voice");
                System.out.println("_________________________________________");
                System.out.println("Tell me, Is plural (1) o singular?(2):");
                int n = entrada.nextInt();
                entrada.nextLine();
                if (n == 1) { //Plural inicio
                    // Plural
                    System.out.println("Does your active voice sentence has a subject? Yes(1)/No(2)");
                    int m = entrada.nextInt();
                    entrada.nextLine();
                    if (m == 1) { // Tiene sujeto inico
                        System.out.println("What the subject of your active voice sentence is?");
                        String subject = entrada.nextLine();
                        System.out.println("What's the main verb of your active voice sentence?");
                        String verb = entrada.nextLine();
                        System.out.println("Regular(1) or Irregular(2)?");
                        int table = entrada.nextInt();
                        if (table == 1) { //Tabla verbos regulares inico
                            String sql = "SELECT * FROM regulars WHERE infinitive= '" + verb + "'";
                            ResultSet rs = statement.executeQuery(sql);
                            entrada.nextLine();
                            if (rs.next()) {
                                System.out.println("Tell me the object of your active voice:");
                                String object = entrada.nextLine();
                                System.out.println("What's the complement of your sentence?");
                                String complement = entrada.nextLine();
                                System.out.println("The sentence is: " + subject + " " + rs.getString(4) + " " + object + " " + complement);
                            } else {
                                System.out.println("Try with another verb");
                            }


                        } //Tabla verbos regulares final
                        if (table == 2) { //Tabla irregulares inicio
                            String sql = "SELECT * FROM irregulars WHERE infinitive= '" + verb + "'";
                            ResultSet rs = statement.executeQuery(sql);
                            entrada.nextLine();
                            if (rs.next()) {
                                System.out.println("Tell me the object of your active voice:");
                                String object = entrada.nextLine();
                                System.out.println("What's the complement of your sentence?");
                                String complement = entrada.nextLine();
                                System.out.println("The sentence is: " + subject + " " + rs.getString(4) + " " + object + " " + complement);

                            } else {
                                System.out.println("Try with another verb");
                            }
                        } //Tabla irregulares final


                    } //Tiene sujeto final
                    if (m == 2) { //No tiene sujeto inicio
                        System.out.println("Choose We(1),They(2), You(3)");
                        int c = entrada.nextInt();
                        if (c == 1) { //We inicio
                            entrada.nextLine();
                            System.out.println("What's the main verb of your active voice sentence?");
                            String verb = entrada.nextLine();
                            System.out.println("Regular(1) or Irregular(2)?");
                            int table = entrada.nextInt();
                            if (table == 1) { //Tabla regulares inicio
                                String sql = "SELECT * FROM regulars WHERE infinitive= '" + verb + "'";
                                ResultSet rs = statement.executeQuery(sql);
                                entrada.nextLine();
                                if (rs.next()) {
                                    System.out.println("Tell me the object of your active voice:");
                                    String object = entrada.nextLine();
                                    System.out.println("What's the complement of your sentence?");
                                    String complement = entrada.nextLine();
                                    System.out.println("The sentence is: We" + " " + rs.getString(4) + " " + object + " " + complement);
                                } else {
                                    System.out.println("Try wiith another verb");
                                }
                            } //Tabla regulares final
                            if (table == 2) { //Tabla irregulares inicio
                                System.out.println("What the subject of your p.v sentence is?");
                                String subject = entrada.nextLine();
                                String sql = "SELECT * FROM irregulars WHERE infinitive= '" + verb + "'";
                                ResultSet rs = statement.executeQuery(sql);
                                entrada.nextLine();
                                if (rs.next()) {
                                    System.out.println("Tell me the object of your active voice:");
                                    String object = entrada.nextLine();
                                    System.out.println("What's the complement of your sentence?");
                                    String complement = entrada.nextLine();
                                    System.out.println("The sentence is: We" + " " + rs.getString(4) + " " + object + " " + complement);
                                } else {
                                    System.out.println("Try wiith another verb");
                                }
                            } //Tabla irregulares final
                        } //We final
                        if (c == 2) { //They inicio
                            entrada.nextLine();
                            System.out.println("What's the main verb of your active voice sentence?");
                            String verb = entrada.nextLine();
                            System.out.println("Regular(1) or Irregular(2)?");
                            int table = entrada.nextInt();
                            if (table == 1) { //Tabla regulares inicio
                                String sql = "SELECT * FROM regulars WHERE infinitive= '" + verb + "'";
                                ResultSet rs = statement.executeQuery(sql);
                                entrada.nextLine();
                                if (rs.next()) {
                                    System.out.println("Tell me the object of your active voice:");
                                    String object = entrada.nextLine();
                                    System.out.println("What's the complement of your sentence?");
                                    String complement = entrada.nextLine();
                                    System.out.println("The sentence is: They" + " " + rs.getString(4) + " " + object + " " + complement);
                                } else {
                                    System.out.println("Try with another verb");
                                }
                            } //Tabla regulares final
                            if (table == 2) { //Tabla irregulares inicio

                                String sql = "SELECT * FROM irregulars WHERE infinitive= '" + verb + "'";
                                ResultSet rs = statement.executeQuery(sql);
                                entrada.nextLine();
                                if (rs.next()) {
                                    System.out.println("Tell me the object of your active voice:");
                                    String object = entrada.nextLine();
                                    System.out.println("What's the complement of your sentence?");
                                    String complement = entrada.nextLine();
                                    System.out.println("The sentence is: They" + " " + rs.getString(4) + " " + object + " " + complement);
                                } else {
                                    System.out.println("Try with another verb");
                                }
                            } //Tabla irregulares final

                        } //They final
                        if (c == 3) { //You inicio
                            entrada.nextLine();
                            System.out.println("What's the main verb of your active voice sentence?");
                            String verb = entrada.nextLine();
                            System.out.println("Regular(1) or Irregular(2)?");
                            int table = entrada.nextInt();
                            if (table == 1) { //Tabla regulares inicio
                                String sql = "SELECT * FROM regulars WHERE infinitive= '" + verb + "'";
                                ResultSet rs = statement.executeQuery(sql);
                                if (rs.next()) {
                                    System.out.println("Tell me the object of your active voice:");
                                    String object = entrada.nextLine();
                                    System.out.println("What's the complement of your sentence?");
                                    String complement = entrada.nextLine();
                                    System.out.println("The sentence is: They" + " " + rs.getString(4) + " " + object + " " + complement);
                                } else {
                                    System.out.println("Try with another verb");
                                }
                            } //Tabla regulares final
                            if (table == 2) { //Tabla irregulares inicio
                                String sql = "SELECT * FROM irregulars WHERE infinitive= '" + verb + "'";
                                ResultSet rs = statement.executeQuery(sql);
                                entrada.nextLine();
                                if (rs.next()) {
                                    System.out.println("Tell me the object of your active voice:");
                                    String object = entrada.nextLine();
                                    System.out.println("What's the complement of your sentence?");
                                    String complement = entrada.nextLine();
                                    System.out.println("The sentence is: They" + " " + rs.getString(4) + " " + object + " " + complement);
                                } else {
                                    System.out.println("Try with another verb");
                                }
                            }//Tabla irregulares final

                        } //You final
                    }//No tiene sujeto final

                } //Plural final

                if (n == 2) {//Singular inicio
                    System.out.println("Does your active voice sentence has a subject? Yes(1)/No(2)");
                    int m = entrada.nextInt();
                    if (m == 1) { //Tiene sujeto inicio
                        entrada.nextLine();
                        System.out.println("What the subject of your a.v sentence is?");
                        String subject = entrada.nextLine();
                        System.out.println("What's the main verb of your active voice sentence?");
                        String verb = entrada.nextLine();
                        System.out.println("Regular(1) or Irregular(2)?");
                        int table = entrada.nextInt();
                        if (table == 1) { //Tabla regular inicio
                            String sql = "SELECT * FROM regulars WHERE infinitive= '" + verb + "'";
                            ResultSet rs = statement.executeQuery(sql);
                            entrada.nextLine();
                            if (rs.next()) {
                                System.out.println("Tell me the object of your active voice:");
                                String object = entrada.nextLine();
                                System.out.println("What's the complement of your sentence?");
                                String complement = entrada.nextLine();
                                System.out.println("The sentence is: " + subject + " " + rs.getString(4) + " " + object + " " + complement);
                            } else {
                                System.out.println("Try with another verb");
                            }
                        } //Tabla regular final
                        if (table == 2) { //Tabla irregular inicio
                            entrada.nextLine();
                            String sql = "SELECT * FROM regulars WHERE infinitive= '" + verb + "'";
                            ResultSet rs = statement.executeQuery(sql);
                            entrada.nextLine();
                            if (rs.next()) {
                                System.out.println("Tell me the object of your active voice:");
                                String object = entrada.nextLine();
                                System.out.println("What's the complement of your sentence?");
                                String complement = entrada.nextLine();
                                System.out.println("The sentence is: " + subject + " " + rs.getString(4) + " " + object + " " + complement);
                            } else {
                                System.out.println("Try with another verb");
                            }
                        }//Tabla irreular final

                    } //No tiene sujeto final
                    if (m == 2) { //No tiene sujeto inicio
                        System.out.println("Choose I(1),He(2), She(3), You(4), It(5)");
                        int c = entrada.nextInt();
                        if (c == 1) {// I inicio
                            entrada.nextLine();
                            System.out.println("What's the main verb of your active voice sentence?");
                            String verb = entrada.nextLine();
                            System.out.println("Regular(1) or Irregular(2)?");
                            int table = entrada.nextInt();
                            if (table == 1) { //TAbla regular inicio
                                entrada.nextLine();
                                String sql = "SELECT * FROM regulars WHERE infinitive= '" + verb + "'";
                                ResultSet rs = statement.executeQuery(sql);
                                if (rs.next()) {
                                    System.out.println("Tell me the object of your active voice:");
                                    String object = entrada.nextLine();
                                    System.out.println("What's the complement of your sentence?");
                                    String complement = entrada.nextLine();
                                    System.out.println("The sentence is: I" + " " + rs.getString(4) + " " + object + " " + complement);
                                } else {
                                    System.out.println("Try with another verb");
                                }
                            } //Tabla regular final
                            if (table == 2) { //Tabla irregular inicio
                                entrada.nextLine();
                                String sql = "SELECT * FROM irregulars WHERE infinitive= '" + verb + "'";
                                ResultSet rs = statement.executeQuery(sql);
                                if (rs.next()) {
                                    System.out.println("Tell me the object of your active voice:");
                                    String object = entrada.nextLine();
                                    System.out.println("What's the complement of your sentence?");
                                    String complement = entrada.nextLine();
                                    System.out.println("The sentence is: I" + " " + rs.getString(4) + " " + object + " " + complement);
                                } else {
                                    System.out.println("Try with another verb");
                                }
                            }//Tabla irregular final
                        } //I final
                        if (c == 2) { //He inicio
                            entrada.nextLine();
                            System.out.println("What's the main verb of your active voice sentence?");
                            String verb = entrada.nextLine();
                            System.out.println("Regular(1) or Irregular(2)?");
                            int table = entrada.nextInt();
                            if (table == 1) { //TAbla regular inicio
                                entrada.nextLine();
                                String sql = "SELECT * FROM regulars WHERE infinitive= '" + verb + "'";
                                ResultSet rs = statement.executeQuery(sql);
                                if (rs.next()) {
                                    System.out.println("Tell me the object of your active voice:");
                                    String object = entrada.nextLine();
                                    System.out.println("What's the complement of your sentence?");
                                    String complement = entrada.nextLine();
                                    System.out.println("The sentence is: He" + " " + rs.getString(4) + " " + object + " " + complement);
                                } else {
                                    System.out.println("Try with another verb");
                                }
                            } //Tabla regular final
                            if (table == 2) { //Tabla irregular inicio
                                entrada.nextLine();
                                String sql = "SELECT * FROM irregulars WHERE infinitive= '" + verb + "'";
                                ResultSet rs = statement.executeQuery(sql);
                                entrada.nextLine();
                                if (rs.next()) {
                                    System.out.println("Tell me the object of your active voice:");
                                    String object = entrada.nextLine();
                                    System.out.println("What's the complement of your sentence?");
                                    String complement = entrada.nextLine();
                                    System.out.println("The sentence is: He" + " " + rs.getString(4) + " " + object + " " + complement);
                                } else {
                                    System.out.println("Try with another verb");
                                }
                            }//Tabla irregular final
                        } //He final
                        if (c == 3) { //She inicio
                            entrada.nextLine();
                            System.out.println("What's the main verb of your active voice sentence?");
                            String verb = entrada.nextLine();
                            System.out.println("Regular(1) or Irregular(2)?");
                            int table = entrada.nextInt();
                            if (table == 1) { //TAbla regular inicio
                                entrada.nextLine();
                                String sql = "SELECT * FROM regulars WHERE infinitive= '" + verb + "'";
                                ResultSet rs = statement.executeQuery(sql);
                                if (rs.next()) {
                                    System.out.println("Tell me the object of your active voice:");
                                    String object = entrada.nextLine();
                                    System.out.println("What's the complement of your sentence?");
                                    String complement = entrada.nextLine();
                                    System.out.println("The sentence is: She" + " " + rs.getString(4) + " " + object + " " + complement);
                                } else {
                                    System.out.println("Try with another verb");
                                }
                            } //Tabla regular final
                            if (table == 2) { //Tabla irregular inicio
                                entrada.nextLine();
                                String sql = "SELECT * FROM irregulars WHERE infinitive= '" + verb + "'";
                                ResultSet rs = statement.executeQuery(sql);
                                entrada.nextLine();
                                if (rs.next()) {
                                    System.out.println("Tell me the object of your active voice:");
                                    String object = entrada.nextLine();
                                    System.out.println("What's the complement of your sentence?");
                                    String complement = entrada.nextLine();
                                    System.out.println("The sentence is: She" + " " + rs.getString(4) + " " + object + " " + complement);
                                } else {
                                    System.out.println("Try with another verb");
                                }
                            }//Tabla irregular final
                        } //She final
                        if (c == 4) { //You inicio
                            entrada.nextLine();
                            System.out.println("What's the main verb of your active voice sentence?");
                            String verb = entrada.nextLine();
                            System.out.println("Regular(1) or Irregular(2)?");
                            int table = entrada.nextInt();
                            if (table == 1) { //TAbla regular inicio
                                entrada.nextLine();
                                String sql = "SELECT * FROM regulars WHERE infinitive= '" + verb + "'";
                                ResultSet rs = statement.executeQuery(sql);
                                if (rs.next()) {
                                    System.out.println("Tell me the object of your active voice:");
                                    String object = entrada.nextLine();
                                    System.out.println("What's the complement of your sentence?");
                                    String complement = entrada.nextLine();
                                    System.out.println("The sentence is: You" + " " + rs.getString(4) + " " + object + " " + complement);
                                } else {
                                    System.out.println("Try with another verb");
                                }
                            } //Tabla regular final
                            if (table == 2) { //Tabla irregular inicio
                                entrada.nextLine();
                                String sql = "SELECT * FROM irregulars WHERE infinitive= '" + verb + "'";
                                ResultSet rs = statement.executeQuery(sql);
                                entrada.nextLine();
                                if (rs.next()) {
                                    System.out.println("Tell me the object of your active voice:");
                                    String object = entrada.nextLine();
                                    System.out.println("What's the complement of your sentence?");
                                    String complement = entrada.nextLine();
                                    System.out.println("The sentence is: You" + " " + rs.getString(4) + " " + object + " " + complement);
                                } else {
                                    System.out.println("Try with another verb");
                                }
                            }//Tabla irregular final

                        } //You final
                        if (c == 5) { //It inicio
                            entrada.nextLine();
                            System.out.println("What's the main verb of your active voice sentence?");
                            String verb = entrada.nextLine();
                            System.out.println("Regular(1) or Irregular(2)?");
                            int table = entrada.nextInt();
                            if (table == 1) { //TAbla regular inicio
                                entrada.nextLine();
                                String sql = "SELECT * FROM regulars WHERE infinitive= '" + verb + "'";
                                ResultSet rs = statement.executeQuery(sql);
                                if (rs.next()) {
                                    System.out.println("Tell me the object of your active voice:");
                                    String object = entrada.nextLine();
                                    System.out.println("What's the complement of your sentence?");
                                    String complement = entrada.nextLine();
                                    System.out.println("The sentence is: It" + " " + rs.getString(4) + " " + object + " " + complement);
                                } else {
                                    System.out.println("Try with another verb");
                                }
                            } //Tabla regular final
                            if (table == 2) { //Tabla irregular inicio
                                entrada.nextLine();
                                String sql = "SELECT * FROM irregulars WHERE infinitive= '" + verb + "'";
                                ResultSet rs = statement.executeQuery(sql);
                                entrada.nextLine();
                                if (rs.next()) {
                                    System.out.println("Tell me the object of your active voice:");
                                    String object = entrada.nextLine();
                                    System.out.println("What's the complement of your sentence?");
                                    String complement = entrada.nextLine();
                                    System.out.println("The sentence is: It" + " " + rs.getString(4) + " " + object + " " + complement);
                                } else {
                                    System.out.println("Try with another verb");
                                }
                            }//Tabla irregular final

                        } //She final
                    }//No tiene sujeto final

                }

            }//Active final
            //Passive inicio
            if (sentece == 2) { //Passive inicio
                System.out.println("_________________________________________");
                System.out.println("              Passive voice");
                System.out.println("_________________________________________");
                System.out.println("Tell me, Is singular (1) o plural?(2):");
                int n = entrada.nextInt();
                entrada.nextLine();
                if (n == 1) { //singular inicio
                    System.out.println("What the subject of your passive voice sentence is?");
                    String subject = entrada.nextLine();
                    System.out.println("What's the main verb of your passive voice sentence?");
                    String verb = entrada.nextLine();
                    System.out.println("Regular(1) or Irregular(2)?");
                    int table = entrada.nextInt();
                    if (table == 1) { //Tabla verbos regulares inico
                        String sql = "SELECT * FROM regulars WHERE infinitive= '" + verb + "'";
                        ResultSet rs = statement.executeQuery(sql);
                        entrada.nextLine();
                        System.out.println("Tell me the object of your passive voice:");
                        String object = entrada.nextLine();
                        System.out.println("Does your passive voice sentence has a complement? Yes(1)/No(2)");
                        int j = entrada.nextInt();
                        if (j == 1) {
                            entrada.nextLine();
                            System.out.println("What's the complement of your sentence?");
                            String complement = entrada.nextLine();
                            while (rs.next()) {
                                System.out.println("The sentence is: " + subject + " was " + rs.getString(5) + " " + object + " " + complement);
                            }
                            rs.close();
                        }

                        if (j == 2) {
                            while (rs.next()) {
                                System.out.println("The sentence is: " + subject + " was " + rs.getString(5) + " " + object);
                            }
                            rs.close();

                        }


                    } //Tabla verbos regulares final
                    if (table == 2) { //Tabla verbos regulares inico
                        String sql = "SELECT * FROM irregulars WHERE infinitive= '" + verb + "'";
                        ResultSet rs = statement.executeQuery(sql);
                        entrada.nextLine();
                        System.out.println("Tell me the object of your passive voice:");
                        String object = entrada.nextLine();
                        System.out.println("Does your passive voice sentence has a complement? Yes(1)/No(2)");
                        int j = entrada.nextInt();
                        if (j == 1) {
                            entrada.nextLine();
                            System.out.println("What's the complement of your sentence?");
                            String complement = entrada.nextLine();
                            while (rs.next()) {
                                System.out.println("The sentence is: " + subject + " was " + rs.getString(5) + " " + object + " " + complement);
                            }
                            rs.close();
                        }

                        if (j == 2) {
                            while (rs.next()) {
                                System.out.println("The sentence is: " + subject + " was " + rs.getString(5) + " " + object);
                            }
                            rs.close();

                        }


                    } //Tabla verbos regulares final
                } //fin singular


                if (n == 2) { //singular inicio
                    System.out.println("What the subject of your passive voice sentence is?");
                    String subject = entrada.nextLine();
                    System.out.println("What's the main verb of your passive voice sentence?");
                    String verb = entrada.nextLine();
                    System.out.println("Regular(1) or Irregular(2)?");
                    int table = entrada.nextInt();
                    if (table == 1) { //Tabla verbos regulares inico
                        String sql = "SELECT * FROM regulars WHERE infinitive= '" + verb + "'";
                        ResultSet rs = statement.executeQuery(sql);
                        entrada.nextLine();
                        System.out.println("Tell me the object of your passive voice:");
                        String object = entrada.nextLine();
                        System.out.println("Does your passive voice sentence has a complement? Yes(1)/No(2)");
                        int j = entrada.nextInt();
                        if (j == 1) {
                            entrada.nextLine();
                            System.out.println("What's the complement of your sentence?");
                            String complement = entrada.nextLine();
                            while (rs.next()) {
                                System.out.println("The sentence is: " + subject + " were " + rs.getString(5) + " " + object + " " + complement);
                            }
                            rs.close();
                        }

                        if (j == 2) {
                            while (rs.next()) {
                                System.out.println("The sentence is: " + subject + " were " + rs.getString(5) + " " + object);
                            }
                            rs.close();

                        }


                    } //Tabla verbos regulares final
                    if (table == 2) { //Tabla verbos regulares inico
                        String sql = "SELECT * FROM irregulars WHERE infinitive= '" + verb + "'";
                        ResultSet rs = statement.executeQuery(sql);
                        entrada.nextLine();
                        System.out.println("Tell me the object of your passive voice:");
                        String object = entrada.nextLine();
                        System.out.println("Does your passive voice sentence has a complement? Yes(1)/No(2)");
                        int j = entrada.nextInt();
                        if (j == 1) {
                            entrada.nextLine();
                            System.out.println("What's the complement of your sentence?");
                            String complement = entrada.nextLine();
                            while (rs.next()) {
                                System.out.println("The sentence is: " + subject + " were " + rs.getString(5) + " " + object + " " + complement);
                            }
                            rs.close();
                        }

                        if (j == 2) {
                            while (rs.next()) {
                                System.out.println("The sentence is: " + subject + " were " + rs.getString(5) + " " + object);
                            }
                            rs.close();

                        }


                    } //Tabla verbos regulares final
                } //fin singular
            }


        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }}


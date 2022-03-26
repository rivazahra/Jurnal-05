package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Soal2 {



        public static void main(String[] args) {
            LinkedList<listTugas> listTugases = new LinkedList<>();

            listTugases.addLast(new listTugas("Jurnal"));
            listTugases.addLast(new listTugas("PBW"));

            Scanner scanner = new Scanner(System.in);

            boolean kondisi = true;
            while (kondisi) {
                menu();
                System.out.println("Tugas yang harus dikerjakan : " + listTugases);
                switch (scanner.nextInt()) {
                    case 1:
                        String namaTugas = scanner.next();
                        listTugases.addLast(new listTugas(namaTugas));
                        break;
                    case 2:
                        System.out.println("List Tugas = ");
                        print(listTugases);
                        break;
                    case 3:
                        if(listTugases.isEmpty()) {
                            System.out.println("Tidak ada tugas tersisa!");
                        }else {
                            removeWithJudul(listTugases, scanner.next());
                        }
                        break;
                    default:
                        break;
                }
            }

        }

        public static void print(LinkedList listTugases){
            ListIterator<listTugas> iterator = listTugases.listIterator();

            while (iterator.hasNext()){
                System.out.print(iterator.next());
                if (iterator.hasNext()){
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }

        public static void removeWithJudul(LinkedList listTugases, String nama){
            ListIterator<listTugas> iterator = listTugases.listIterator();
            while (iterator.hasNext()){
                listTugas listTugas = iterator.next();
                if (listTugas.getNamaTugas().equals(nama)){
                    iterator.remove();
                }
            }
        }

        public static void menu(){
            System.out.println("To-Do List");
            System.out.println("1. Input Tugas");
            System.out.println("2. Daftar Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
        }
    }



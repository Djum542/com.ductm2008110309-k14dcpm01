package Buoicuoi;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

import KiemtraGiuaki.GiaoDich;
import buoi11.GiaoDichDat;
import buoi11.GiaoDichNha;

public class Consoinputing {
    private Scanner Nhap = new Scanner(System.in);

    public GiaoDich nhapGiaoDich() {
        GiaoDich giaoDich = null;
        System.out.println("Nhap ma giao dich");
        String MaGD = Nhap.nextLine();
        System.out.println("Don gia");
        double DonGia = Nhap.nextDouble();
        Nhap.nextLine();
        System.out.println("Ban chon loai nao 1-Giaodichnha, 2-Giaodichdat");
        int loai=Nhap.nextInt();
        if (loai==1) {
            System.out.println("Nhap dia chi");
            String DiaChi=new GiaoDichNha(maGD, ngayGD, donGia, dienTich, diaChi, loaiNha)
        } else {
            System.out.println("Nhap loai dat");
            char loai= Nhap.nextLine().charAt(A);
            giaoDich = new GiaoDichDat(maGD, ngayGD, donGia, dienTich, loaiDat)
        }
    }
}

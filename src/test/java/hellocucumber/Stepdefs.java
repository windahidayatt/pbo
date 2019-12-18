package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.*;

class makanan{
    public String makanan;
    public int jumlah;
    public int harga;

    public makanan(String makanan, int jumlah,int harga){
        this.makanan = makanan;
        this.jumlah = jumlah;
        this.harga=harga;
    }
}
public class Stepdefs {
    protected int jenis_order;
    protected String keterangan;
    protected String nama, no_hp, alamat;

    ArrayList<makanan> arrMakanan = new ArrayList<>();

    @Given("^Menampilkan jenis order$")
    public void menampilkan_jenis_order() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("1. Dine In");
        System.out.println("2. Take Away");
    }

    @When("^Saya memilih jenis order \"([^\"]*)\"$")
    public void saya_memilih_jenis_order(int arg1){
        // Write code here that turns the phrase above into concrete actions
        this.jenis_order=arg1;
    }

    @Then("^Mencatat keterangan order \"([^\"]*)\"$")
    public void mencatat_keterangan_order(String arg1){
        // Write code here that turns the phrase above into concrete actions
        this.keterangan=arg1;
    }
    @Given("^Menampilkan menu makanan$")
    public void menampilkan_menu_makanan() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Nasi Goreng     10000");
        System.out.println("Ayam Geprek     10000");
    }
    @When("^Saya memilih \"([^\"]*)\" sebanyak (\\d+) dengan harga (\\d+)$")
    public void saya_memilih_sebanyak_dengan_harga(String arg1, int arg2, int arg3) {
        // Write code here that turns the phrase above into concrete actions
        arrMakanan.add(new makanan(arg1, arg2, arg3));
    }

    @Then("^Menghitung total bayar$")
    public int menghitung_total_bayar(){
        // Write code here that turns the phrase above into concrete actions
        int total=0;
        for(makanan e : arrMakanan){
            total = total + e.harga;
        }
        return total;
    }

    @Given("^menampilkan form data pelanggan$")
    public void menampilkan_form_data_pelanggan() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Nama Pelanggan : ");
        System.out.println("Nomor Hp       : ");
        System.out.println("Alamat         : ");

    }

    @When("^saya mengisi form data pelanggan \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void saya_mengisi_form_data_pelanggan(String arg1, String arg2, String arg3) {
        // Write code here that turns the phrase above into concrete actions
        this.nama=arg1;
        this.no_hp=arg2;
        this.alamat=arg3;
    }

    @Then("^mencatat form data pelanggan \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void mencatat_form_data_pelanggan(String arg1, String arg2, String arg3){
        // Write code here that turns the phrase above into concrete actions
        String FileName = "Data Pelanggan.txt";
            try{
                BufferedWriter out = new BufferedWriter(new FileWriter(FileName, true));
                out.write("====== Data Pelanggan ======\n");
                out.write("Nama     : " + arg1+ "\n");
                out.write("No. Hp   : " + arg2+ "\n");
                out.write("Alamat   : " + arg3 + "\n");
                out.close();
            }
            catch(IOException i){
                System.out.println("Exception occured" + i);
            }
    }

    public void menampilkan(){
        for(makanan e : arrMakanan){
            System.out.printf( "%s  |  %d Rp.%d %n",e.makanan, e.jumlah, e.harga);
        }
    }
}
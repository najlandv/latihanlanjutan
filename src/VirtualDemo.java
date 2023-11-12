import java.util.Scanner;

public class VirtualDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Member member1 = new MemberReguler();
        Member member2 = new MemberSilver();
        Member member3 = new MemberGold();
        Member member4 = new MemberPlatinum();

        MemberSilver memberSilver = new MemberSilver();
        MemberGold memberGold = new MemberGold();
        MemberPlatinum memberPlatinum = new MemberPlatinum();

        //MemberReguler
        System.out.println("--------------- Member Reguler ---------------");
        System.out.print("Masukkan jumlah belanja untuk member reguler: ");
        int belanja1 = scanner.nextInt();
        int totalBayar1 = member1.hitungTotalBayar(belanja1);
        System.out.println("Total bayar member reguler: " + totalBayar1);

        //MemberSilver
        System.out.println("---------------  Member Silver --------------- ");
        System.out.print("Masukkan jumlah belanja untuk member silver: ");
        int belanja2 = scanner.nextInt();
        int totalBayar2 = member2.hitungTotalBayar(belanja2);
        System.out.print("Masukkan jarak tujuan untuk Member Silver (km): ");
        double jarakSilver = scanner.nextDouble();
        double ongkirSilver = memberSilver.hitungOngkir(jarakSilver);

        System.out.println("Total bayar member silver: " + totalBayar2);
        System.out.println("Ongkir Member Silver: " + ongkirSilver);
       
        //MemberGold
        System.out.println("---------------  Member Gold --------------- ");
        System.out.print("Masukkan jumlah belanja untuk member gold: ");
        int belanja3 = scanner.nextInt();
        int totalBayar3 = member3.hitungTotalBayar(belanja3);
        System.out.print("Masukkan jarak tujuan untuk Member Gold (km): ");
        double jarakGold = scanner.nextDouble();
        double ongkirGold = memberGold.hitungOngkir(jarakGold);
        double cicilan3 = totalBayar3 /12;

        System.out.println("Total bayar member gold: " + totalBayar3);
        System.out.println("Ongkir Member Gold: " + ongkirGold);
        System.out.println("Cicilan PerBulan: Rp. " + cicilan3 + "/bulan");

        //MemberPlatinum
        System.out.println("---------------  Member Platinum --------------- ");
        System.out.print("Masukkan jumlah belanja untuk member platinum: ");
        int belanja4 = scanner.nextInt();
        int totalBayar4 = member4.hitungTotalBayar(belanja4);
        System.out.print("Masukkan jarak tujuan untuk Member Platinum (km): ");
        double jarakPlatinum = scanner.nextDouble();
        double ongkirPlatinum = memberPlatinum.hitungOngkir(jarakPlatinum);
        double cicilan4 = totalBayar4 /12;
        System.out.print("Masukkan jumlah deposit untuk Member Platinum: ");
        int depositPlatinum = scanner.nextInt();
        int saldoPlatinum = memberPlatinum.deposit(depositPlatinum);

        System.out.println("Total bayar member platinum: " + totalBayar4);
        System.out.println("Ongkir Member Platinum: " + ongkirPlatinum);
        System.out.println("Cicilan PerBulan: Rp. " + cicilan4 + "/bulan");
        System.out.println("Saldo Member Platinum setelah deposit: " + saldoPlatinum);

        scanner.close();
    }
   
}

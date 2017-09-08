package Latihan2;


class Employ extends Person {
    
    private String noKaryawan;
    
    public Employ (String noKaryawan, String nama, int usia)
    {
        super(nama, usia);
        this.noKaryawan = noKaryawan;
    }
    
    public void info()
    {
        System.out.println("No. Karyawan : "+this.noKaryawan);
        super.info();
    }
}

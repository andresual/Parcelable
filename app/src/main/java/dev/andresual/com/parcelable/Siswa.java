package dev.andresual.com.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class Siswa implements Parcelable {
    private long id;
    private String nama;
    private String kelas;

    public Siswa(long id, String nama, String kelas) {
        this.id = id;
        this.nama = nama;
        this.kelas = kelas;
    }

    protected Siswa(Parcel in) {
        id = in.readLong();
        nama = in.readString();
        kelas = in.readString();
    }

    public static final Creator<Siswa> CREATOR = new Creator<Siswa>() {
        @Override
        public Siswa createFromParcel(Parcel in) {
            return new Siswa(in);
        }

        @Override
        public Siswa[] newArray(int size) {
            return new Siswa[size];
        }
    };

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(id);
        parcel.writeString(nama);
        parcel.writeString(kelas);
    }

    // Agar ringkas, getter dan seter tidak penulis sertakan
}

package com.example.petsocial;

import android.net.Uri;

import androidx.annotation.NonNull;

public class Profile {

    private String Username;
    private String Petname;
    private Uri ProfilePic;
    private String OwnerName;
    private String OwnerCellphone;
    private String Bio;
    private String PetClass;
    private String Genus;




    public Profile(String aClass, String genus, String ownerCellphone, String ownerName, String petname, Uri profilePic, String username, String bio) {
        Bio=bio;
        PetClass = aClass;
        Genus = genus;
        OwnerCellphone = ownerCellphone;
        OwnerName = ownerName;
        Petname = petname;
        ProfilePic = profilePic;
        Username = username;
    }

    public String getBio() {
        return Bio;
    }

    public void setBio(String bio) {
        Bio = bio;
    }

    public String getGenus() {
        return Genus;
    }

    public void setGenus(String genus) {
        Genus = genus;
    }

    public String getOwnerCellphone() {
        return OwnerCellphone;
    }

    public void setOwnerCellphone(String ownerCellphone) {
        OwnerCellphone = ownerCellphone;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public String getPetClass() {
        return PetClass;
    }

    public void setPetClass(String petClass) {
        PetClass = petClass;
    }

    public String getPetname() {
        return Petname;
    }

    public void setPetname(String petname) {
        Petname = petname;
    }

    public Uri getProfilePic() {
        return ProfilePic;
    }

    public void setProfilePic(Uri profilePic) {
        ProfilePic = profilePic;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }
}

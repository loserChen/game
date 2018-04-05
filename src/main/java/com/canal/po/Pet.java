package com.canal.po;

public class Pet {
    private Integer petId;

    private Byte hp;

    private Byte attack;

    private Byte defence;

    private Byte specialAttack;

    private Byte specialDefence;

    private Byte speed;

    private Short total;

    private Integer userId;

    private String image;

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Byte getHp() {
        return hp;
    }

    public void setHp(Byte hp) {
        this.hp = hp;
    }

    public Byte getAttack() {
        return attack;
    }

    public void setAttack(Byte attack) {
        this.attack = attack;
    }

    public Byte getDefence() {
        return defence;
    }

    public void setDefence(Byte defence) {
        this.defence = defence;
    }

    public Byte getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(Byte specialAttack) {
        this.specialAttack = specialAttack;
    }

    public Byte getSpecialDefence() {
        return specialDefence;
    }

    public void setSpecialDefence(Byte specialDefence) {
        this.specialDefence = specialDefence;
    }

    public Byte getSpeed() {
        return speed;
    }

    public void setSpeed(Byte speed) {
        this.speed = speed;
    }

    public Short getTotal() {
        return total;
    }

    public void setTotal(Short total) {
        this.total = total;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }
}
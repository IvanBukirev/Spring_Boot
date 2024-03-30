package ru.netology.Spring_Boot;

public class ProductionProfile implements  SystemProfile{
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
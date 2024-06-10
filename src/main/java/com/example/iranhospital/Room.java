package com.example.iranhospital;

import com.ascteral.stellarhospital.*;

public class Room {
    public Patient[] patients;
    public Patient[] man;
    public Patient[] woman;
    private String unit;
    public Room(String unit) {
        unit = unit;
        patients = new Patient[12];
        man = new Patient[6];
        woman = new Patient[6];
    }
    public void getPatients() {
        switch (this.unit) {
            case "emergency" :
                Emergency unit = new Emergency();
                for (int i = 0; i < 12;i++) {
                    if (unit.getPatientInformation(i)==null) {
                        continue;
                    } else {
                        patients[i] = unit.getPatientInformation(i);
                    }
                }
            case "ICU" :
                ICU icu = new ICU();
                for (int i = 0; i < 12;i++) {
                    if (icu.getPatientInformation(i)==null) {
                        continue;
                } else {
                    patients[i] = icu.getPatientInformation(i);
                }
                }
            case "CCU" :
                CCU ccu = new CCU();
                for (int i = 0; i < 12;i++) {
                    if (ccu.getPatientInformation(i)==null) {
                        continue;
                    } else {
                        patients[i] = ccu.getPatientInformation(i);
                    }
                }
            case "NICU" :
                NICU nicu = new NICU();
                for (int i = 0; i < 12;i++) {
                    if (nicu.getPatientInformation(i)==null) {
                        continue;
                    } else {
                        patients[i] = nicu.getPatientInformation(i);
                    }
                }
            case "Neurology" :
                Neurology neurology = new Neurology();
                for (int i = 0; i < 12;i++) {
                    if (neurology.getPatientInformation(i)==null) {
                        continue;
                    } else {
                        patients[i] = neurology.getPatientInformation(i);
                    }
                }
            case "obstetrics" :
                Obstetrics obstetrics = new Obstetrics();
                for (int i = 0; i < 12;i++) {
                    if (obstetrics.getPatientInformation(i)==null) {
                        continue;
                    } else {
                        patients[i] = obstetrics.getPatientInformation(i);
                    }
                }
            case "PICU" :
                PICU picu = new PICU();
                for (int i = 0; i < 12;i++) {
                    if (picu.getPatientInformation(i)==null) {
                        continue;
                    } else {
                        patients[i] = picu.getPatientInformation(i);
                    }
                }
        }
    }
    public void getToBeds() {
        getPatients();
        int j = 0;
        int k = 0;
        for (int i = 0 ; i < 12 ; i++) {
            if (k > 5 )
                break;
            if (j > 5) {
                break;
            }
            if (patients[i].getIsMale()) {
                man[j] = patients[i];
                j++;
            } else {
                woman[k] = patients[i];
                k++;
            }
        }
    }
}

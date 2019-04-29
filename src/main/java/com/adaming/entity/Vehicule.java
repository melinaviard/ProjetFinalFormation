package com.adaming.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name = "Vehicule_infos")
public class Vehicule implements Serializable{
	@Id
	@Column(name="id_vehicule")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_vehicule;
	private String type;
	private String marque;
	private int nombrePlaces;
	private double consommation;
	private String emplacement;
	private String disponibilite;
	private String etatLieu;
//	private String Photo;
	
	@OneToOne(mappedBy="vehicule")
	private Reservation reservation;
	private String photo;

	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Vehicule(int id_vehicule, String type, String marque, int nombrePlaces, double consommation,
			String emplacement, String disponibilite, String etatLieu) {
		super();
		this.id_vehicule = id_vehicule;
		this.type = type;
		this.marque = marque;
		this.nombrePlaces = nombrePlaces;
		this.consommation = consommation;
		this.emplacement = emplacement;
		this.disponibilite = disponibilite;
		this.etatLieu = etatLieu;
	}
	
	//Sans Id :
	public Vehicule( String type, String marque, int nombrePlaces, double consommation,
			String emplacement, String disponibilite, String etatLieu) {
		super();
		this.type = type;
		this.marque = marque;
		this.nombrePlaces = nombrePlaces;
		this.consommation = consommation;
		this.emplacement = emplacement;
		this.disponibilite = disponibilite;
		this.etatLieu = etatLieu;
	}


	@Override
	public String toString() {
		return "Vehicule [id_vehicule=" + id_vehicule + ", type=" + type + ", marque=" + marque + ", nombrePlaces="
				+ nombrePlaces + ", consommation=" + consommation + ", emplacement=" + emplacement + ", disponibilite="
				+ disponibilite + ", etatLieu=" + etatLieu + "]";
	}
	
	// Sans l'Id :
	public String toString1() {
		return "Vehicule [ type=" + type + ", marque=" + marque + ", nombrePlaces="
				+ nombrePlaces + ", consommation=" + consommation + ", emplacement=" + emplacement + ", disponibilite="
				+ disponibilite + ", etatLieu=" + etatLieu + "]";
	}


	public int getId_vehicule() {
		return id_vehicule;
	}


	public void setId_vehicule(int id_vehicule) {
		this.id_vehicule = id_vehicule;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getMarque() {
		return marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}


	public int getNombrePlaces() {
		return nombrePlaces;
	}


	public void setNombrePlaces(int nombrePlaces) {
		this.nombrePlaces = nombrePlaces;
	}


	public double getConsommation() {
		return consommation;
	}


	public void setConsommation(double consommation) {
		this.consommation = consommation;
	}


	public String getEmplacement() {
		return emplacement;
	}


	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}


	public String getDisponibilite() {
		return disponibilite;
	}


	public void setDisponibilite(String disponibilite) {
		this.disponibilite = disponibilite;
	}


	public String getEtatLieu() {
		return etatLieu;
	}


	public void setEtatLieu(String etatLieu) {
		this.etatLieu = etatLieu;
	}


	
//	
//	// Photo added
//	public String getPhoto() {
//		return Photo;
//	}
//
//
//	public void setPhoto(String photo) {
//		Photo = photo;
//	}
//	
//	
//	public Vehicule(int id_vehicule, String type, String marque, int nombrePlaces, double consommation,
//			String emplacement, String disponibilite, String etatLieu, String photo, Reservation reservation) {
//		super();
//		this.id_vehicule = id_vehicule;
//		this.type = type;
//		this.marque = marque;
//		this.nombrePlaces = nombrePlaces;
//		this.consommation = consommation;
//		this.emplacement = emplacement;
//		this.disponibilite = disponibilite;
//		this.etatLieu = etatLieu;
//		this.photo = photo;
//		this.reservation = reservation;
//	}


}

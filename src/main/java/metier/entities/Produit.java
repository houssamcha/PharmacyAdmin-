package metier.entities;

import java.io.Serializable;

public class Produit implements Serializable {
	private Long id_produit;
	private char nom_article;
	int quantite;
	float prix;
	char description;
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId_produit() {
		return id_produit;
	}
	public void setId_produit(Long id_produit) {
		this.id_produit = id_produit;
	}
	public char getNom_article() {
		return nom_article;
	}
	public void setNom_article(char nom_article) {
		this.nom_article = nom_article;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public char getDescription() {
		return description;
	}
	public void setDescription(char description) {
		this.description = description;
	}
	public Produit(char nom_article, int quantite, float prix, char description) {
		super();
		this.nom_article = nom_article;
		this.quantite = quantite;
		this.prix = prix;
		this.description = description;
	}
}

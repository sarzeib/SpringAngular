package com.example.demo;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Lyricist")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Lyricist implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="lyricistId")
	private Long lyricist_Id;
	
	@Column(name="fName")
	private String fName;
	
	@Column(name="lName")
	private String lName;
	
	@Column(name="phoneNo")
	private Long phoneNo;
	
	@Column(name="email_ID")
	private String email_ID;
	
	@Column(name="lyrics_ID")
	private long lyrics_ID;
	
	public Long getLyricist_Id() {
		return lyricist_Id;
	}
	public void setLyricist_Id(Long lyricist_Id) {
		this.lyricist_Id = lyricist_Id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail_ID() {
		return email_ID;
	}
	public void setEmail_ID(String email_ID) {
		this.email_ID = email_ID;
	}
	public long getLyrics_ID() {
		return lyrics_ID;
	}
	public void setLyrics_ID(long lyrics_ID) {
		this.lyrics_ID = lyrics_ID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email_ID == null) ? 0 : email_ID.hashCode());
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		result = prime * result + ((lyricist_Id == null) ? 0 : lyricist_Id.hashCode());
		result = prime * result + (int) (lyrics_ID ^ (lyrics_ID >>> 32));
		result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lyricist other = (Lyricist) obj;
		if (email_ID == null) {
			if (other.email_ID != null)
				return false;
		} else if (!email_ID.equals(other.email_ID))
			return false;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		if (lyricist_Id == null) {
			if (other.lyricist_Id != null)
				return false;
		} else if (!lyricist_Id.equals(other.lyricist_Id))
			return false;
		if (lyrics_ID != other.lyrics_ID)
			return false;
		if (phoneNo == null) {
			if (other.phoneNo != null)
				return false;
		} else if (!phoneNo.equals(other.phoneNo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Lyricist [lyricist_Id=" + lyricist_Id + ", fName=" + fName + ", lName=" + lName + ", phoneNo=" + phoneNo
				+ ", email_ID=" + email_ID + ", lyrics_ID=" + lyrics_ID + "]";
	}

}

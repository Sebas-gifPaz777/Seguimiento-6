package model;

public class Contries implements Comparable<Contries> {

	private String country;
	private int goldm, silverm, broncem, goldf, silverf, broncef,goldc,silverc,bronzec;
	
	public Contries(String country, int goldm, int silverm, int broncem, int goldf, int silverf, int broncef) {
		this.country = country;
		this.goldm = goldm;
		this.silverm = silverm;
		this.broncem = broncem;
		this.goldf = goldf;
		this.silverf = silverf;
		this.broncef = broncef;
		goldc=0;
		silverc=0;
		bronzec=0;
	}

	public String getCountry() {
		return country;
	}

	public int getGoldm() {
		return goldm;
	}

	public int getSilverm() {
		return silverm;
	}

	public int getBroncem() {
		return broncem;
	}

	public int getGoldf() {
		return goldf;
	}

	public int getSilverf() {
		return silverf;
	}

	public int getBroncef() {
		return broncef;
	}
	
	public int getGoldc() {
		return goldc=goldm+goldf;
	}

	public int getSilverc() {
		return silverc=silverm+silverf;
	}

	public int getBronzec() {
		return bronzec=broncem+broncef;
	}

	public int compareByGoldw(Contries otherobj) {
		if(goldf>otherobj.getGoldf()) {
			return 1;
		}
		else if(goldf<otherobj.getGoldf()) {
			return -1;
		}
		else {
			if(goldf>otherobj.getSilverf()) {
				return 1;
			}
			else if(goldf<otherobj.getSilverf()) {
				return -1;
			}
			else {
				if(goldf>otherobj.getBroncef()) {
					return 1;
				}
				else if(goldf<otherobj.getBroncef()) {
					return -1;
				}
				else
					return 0;
			}
		}
	}

	@Override
	public int compareTo(Contries o) {
		return 0;
	}
}

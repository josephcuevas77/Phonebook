package Project3;

import java.util.ArrayList;

public class Favorite {
	private ArrayList<FavoriteContactFrame> favorites = new ArrayList<FavoriteContactFrame>(); 

	public Favorite() {
		favorites = new ArrayList<FavoriteContactFrame>();
	}

	public void addFavorite(FavoriteContactFrame f) {
		favorites.add(f);
	}

	public boolean removeFav(FavoriteContactFrame f, String name) {
		for (int i=0; i<favorites.size(); i++) {
			FavoriteContactFrame contactInfo = favorites.get(i);
			String contactName = contactInfo.getContactName();
			if (contactName.equals(f.getContactName())) {
				favorites.remove(f);
				return true;
			}
		}
		return false;
	}

	public int getSize() {
		return favorites.size();
	}

	public void replaceFav(int index, FavoriteContactFrame change) {
		favorites.set(index, change);
	}

	public FavoriteContactFrame getFavorite(String name) {
		for (FavoriteContactFrame f: favorites) {
			if (f.getContactName().equals(name)) {
				return f;
			}
		}
		return null;
	}

	public FavoriteContactFrame getFavoriteAt(int index) {
		return favorites.get(index);
	}

	public void showFavs() {
		for (FavoriteContactFrame f: favorites) {
			f.displayContactFrame();
		}
	}

}

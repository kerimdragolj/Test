import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		Showpiece s1 = new Showpiece("aaaaShowpiece", "picture");
		Showpiece s2 = new Showpiece("bbbSowpiece", "picture");
		Showpiece s3 = new Showpiece("cccSowpiece", "piece");
		Showpiece s4 = new Showpiece("ffffSowpiece", "piece");
		Showpiece s5 = new Showpiece("eeeeSowpiece", "sclupture");
		Showpiece s6 = new Showpiece("uuuuuuuSowpiece", "painting");
		Showpiece s7 = new Showpiece("zzzzzzSowpiece", "sclupture");
		
		ArrayList<Showpiece> showpieceList = new ArrayList<Showpiece>();
		
		showpieceList.add(s1);
		showpieceList.add(s7);
		showpieceList.add(s3);
		showpieceList.add(s2);
		showpieceList.add(s4);
		showpieceList.add(s6);
		showpieceList.add(s5);
		
		Collections.sort(showpieceList);
		
		for(int i = 0; i < showpieceList.size(); i++) {
			System.out.println(showpieceList.get(i));
			System.out.println();
		}
		
		ArtWork a1 = new ArtWork("aaaArtwork1", "artwork aaa bbbb ddd", "Mujo1", ArtWork.Age.CONTEMPORARY);
		ArtWork a2 = new ArtWork("yyyyArtwork2", "artwork", "Mujo2", ArtWork.Age.MODERN);
		ArtWork a3 = new ArtWork("zzzzArtwork2", "artwork", "Mujo3", ArtWork.Age.MODERN);
		ArtWork a4 = new ArtWork("tttttArtwork3", "artwork", "Mujo4", ArtWork.Age.MODERN);
		ArtWork a5 = new ArtWork("ddddArtwork4", "artwork", "Mujo5", ArtWork.Age.CONTEMPORARY);
		
		ArrayList<ArtWork> artworkList= new ArrayList<>();
		
		artworkList.add(a1);
		artworkList.add(a2);
		artworkList.add(a3);
		artworkList.add(a4);
		artworkList.add(a5);
	
		for(int i = 0; i < artworkList.size(); i++) {
			System.out.println(artworkList.get(i));
		}
		
		System.out.println("Fiitssearch: " + a1.fiitsSearch("Artwork1"));
		
		
		Artifact ar1 = new Artifact("fsafas", "FASFaSFasf", "sfasfasgasgasfg",Artifact.Age.MIDDLE_AGE, "asfasfasfas");
		Artifact ar2 = new Artifact("fsafas", "FASFaSFasf", "sfasfasgasgasfg",Artifact.Age.MIDDLE_AGE, "asfasfasfas");
		Artifact ar3 = new Artifact("fsafas", "FASFaSFasf", "sfasfasgasgasfg",Artifact.Age.MIDDLE_AGE, "asfasfasfas");
		Artifact ar4 = new Artifact("fsafas", "FASFaSFasf", "sfasfasgasgasfg",Artifact.Age.MIDDLE_AGE, "asfasfasfas");
		Artifact ar5 = new Artifact("fsafas", "FASFaSFasf", "sfasfasgasgasfg",Artifact.Age.MIDDLE_AGE, "asfasfasfas");
		
		ArrayList<Artifact> artifactList = new ArrayList<Artifact>();
		
		
	}
}

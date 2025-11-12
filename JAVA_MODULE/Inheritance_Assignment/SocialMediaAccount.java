
public class SocialMediaAccount {
                String userName;
                String email;
                boolean isPublic;
                boolean isVerified;
                String countryOrigin;
                int noOfPost;
                int likes;
                int comments;
                String createdAt;
                
                
                
                
                
                
				public SocialMediaAccount() {
					
					this.userName = "Default Name";
					this.email = "xyz@gmail.com";
					this.isPublic = true;
					this.isVerified = false;
					this.countryOrigin = "Default country";
					this.noOfPost = 25;
					this.likes = 455;
					this.comments = 54;
					this.createdAt = "24-10-2025";
				}


				public SocialMediaAccount(String userName, String email, boolean isPublic, boolean isVerified,
						String countryOrigin, int noOfPost, int likes, int comments, String createdAt) {
					
					this.userName = userName;
					this.email = email;
					this.isPublic = isPublic;
					this.isVerified = isVerified;
					this.countryOrigin = countryOrigin;
					this.noOfPost = noOfPost;
					this.likes = likes;
					this.comments = comments;
					this.createdAt = createdAt;
				}
				
				
				public String getUserName() {
					return userName;
				}
				public void setUserName(String userName) {
					this.userName = userName;
				}
				public String getEmail() {
					return email;
				}
				public void setEmail(String email) {
					this.email = email;
				}
				public boolean isPublic() {
					return isPublic;
				}
				public void setPublic(boolean isPublic) {
					this.isPublic = isPublic;
				}
				public boolean isVerified() {
					return isVerified;
				}
				public void setVerified(boolean isVerified) {
					this.isVerified = isVerified;
				}
				public String getCountryOrigin() {
					return countryOrigin;
				}
				public void setCountryOrigin(String countryOrigin) {
					this.countryOrigin = countryOrigin;
				}
				public int getNoOfPost() {
					return noOfPost;
				}
				public void setNoOfPost(int noOfPost) {
					this.noOfPost = noOfPost;
				}
				public int getLikes() {
					return likes;
				}
				public void setLikes(int likes) {
					this.likes = likes;
				}
				public int getComments() {
					return comments;
				}
				public void setComments(int comments) {
					this.comments = comments;
				}
				public String getCreatedAt() {
					return createdAt;
				}
				public void setCreatedAt(String createdAt) {
					this.createdAt = createdAt;
				}
                
				void display() {
				    System.out.println("Username: " + userName);
				    System.out.println("Email: " + email);
				    System.out.println("Public Profile: " + isPublic);
				    System.out.println("Verified: " + isVerified);
				    System.out.println("Country of Origin: " + countryOrigin);
				    System.out.println("Number of Posts: " + noOfPost);
				    System.out.println("Total Likes: " + likes);
				    System.out.println("Total Comments: " + comments);
				    System.out.println("Account Created At: " + createdAt);
				}
                              
}// SocialMediaAccount class ends here

class InstagramAccount extends SocialMediaAccount {
	int noOfFollowers;
	int noOfFollowing;
	int noOfHighlights;
	int noOfPostArchieve;
	int noOfStoryArchieve;
	int noOfAudioSave;
	
	
	
	
	
	public InstagramAccount() {
        super(); // calls SocialMediaAccount default constructor
        this.noOfFollowers = 45;
        this.noOfFollowing = 25;
        this.noOfHighlights = 25;
        this.noOfPostArchieve = 45;
        this.noOfStoryArchieve = 48;
        this.noOfAudioSave = 47;
    }

    public InstagramAccount(String userName, String email, boolean isPublic, boolean isVerified,
                            String countryOrigin, int noOfPost, int likes, int comments, String createdAt,
                            int noOfFollowers, int noOfFollowing, int noOfHighlights, int noOfPostArchieve,
                            int noOfStoryArchieve, int noOfAudioSave) {
        super(userName, email, isPublic, isVerified, countryOrigin, noOfPost, likes, comments, createdAt);
        this.noOfFollowers = noOfFollowers;
        this.noOfFollowing = noOfFollowing;
        this.noOfHighlights = noOfHighlights;
        this.noOfPostArchieve = noOfPostArchieve;
        this.noOfStoryArchieve = noOfStoryArchieve;
        this.noOfAudioSave = noOfAudioSave;
    }
	public int getNoOfFollowers() {
		return noOfFollowers;
	}
	public void setNoOfFollowers(int noOfFollowers) {
		this.noOfFollowers = noOfFollowers;
	}
	public int getNoOfFollowing() {
		return noOfFollowing;
	}
	public void setNoOfFollowing(int noOfFollowing) {
		this.noOfFollowing = noOfFollowing;
	}
	public int getNoOfHighlights() {
		return noOfHighlights;
	}
	public void setNoOfHighlights(int noOfHighlights) {
		this.noOfHighlights = noOfHighlights;
	}
	public int getNoOfPostArchieve() {
		return noOfPostArchieve;
	}
	public void setNoOfPostArchieve(int noOfPostArchieve) {
		this.noOfPostArchieve = noOfPostArchieve;
	}
	public int getNoOfStoryArchieve() {
		return noOfStoryArchieve;
	}
	public void setNoOfStoryArchieve(int noOfStoryArchieve) {
		this.noOfStoryArchieve = noOfStoryArchieve;
	}
	public int getNoOfAudioSave() {
		return noOfAudioSave;
	}
	public void setNoOfAudioSave(int noOfAudioSave) {
		this.noOfAudioSave = noOfAudioSave;
	}
	
	void display() {
        super.display(); 
        System.out.println("Followers: " + noOfFollowers);
        System.out.println("Following: " + noOfFollowing);
        System.out.println("Highlights: " + noOfHighlights);
        System.out.println("Post Archive: " + noOfPostArchieve);
        System.out.println("Story Archive: " + noOfStoryArchieve);
        System.out.println("Audio Saved: " + noOfAudioSave);
    }
	
	
}// instagram Account class ends here

class LinkdenAccount extends SocialMediaAccount{
	    int noOfConnections;
	    int noOfProfileView;
	    int noOfJobsApplied;
	    
	    
	    
	    
	    
	    
		public LinkdenAccount() {
			super();
			this.noOfConnections = 54;
			this.noOfProfileView = 45;
			this.noOfJobsApplied = 25;
		}
		public LinkdenAccount(String userName, String email, boolean isPublic, boolean isVerified,
                String countryOrigin, int noOfPost, int likes, int comments, String createdAt,int noOfConnections, int noOfProfileView, int noOfJobsApplied) {
	        super(userName, email, isPublic, isVerified, countryOrigin, noOfPost, likes, comments, createdAt);
			this.noOfConnections = noOfConnections;
			this.noOfProfileView = noOfProfileView;
			this.noOfJobsApplied = noOfJobsApplied;
		}
		public int getNoOfConnections() {
			return noOfConnections;
		}
		public void setNoOfConnections(int noOfConnections) {
			this.noOfConnections = noOfConnections;
		}
		public int getNoOfProfileView() {
			return noOfProfileView;
		}
		public void setNoOfProfileView(int noOfProfileView) {
			this.noOfProfileView = noOfProfileView;
		}
		public int getNoOfJobsApplied() {
			return noOfJobsApplied;
		}
		public void setNoOfJobsApplied(int noOfJobsApplied) {
			this.noOfJobsApplied = noOfJobsApplied;
		}
	    
		void display() {
			super.display();
		    System.out.println("Number of Connections: " + noOfConnections);
		    System.out.println("Number of Profile Views: " + noOfProfileView);
		    System.out.println("Number of Jobs Applied: " + noOfJobsApplied);
		}

	    
	    
}//linkden Account ends here

class YoutubeAccount extends SocialMediaAccount{
	         int noOfSubscribers;
	         int watchTime;
	         boolean isMonetize;
	         double estimatedRevenue;
	         
	         
	         
	         
	         
	         
			 public YoutubeAccount() {
				super();
				this.noOfSubscribers = 87;
				this.watchTime = 587;
				this.isMonetize = false;
				this.estimatedRevenue = 47555;
			}
			 public YoutubeAccount(String userName, String email, boolean isPublic, boolean isVerified,
		                String countryOrigin, int noOfPost, int likes, int comments, String createdAt,int noOfSubscribers, int watchTime, boolean isMonetize, double estimatedRevenue) {
			        super(userName, email, isPublic, isVerified, countryOrigin, noOfPost, likes, comments, createdAt);
				this.noOfSubscribers = noOfSubscribers;
				this.watchTime = watchTime;
				this.isMonetize = isMonetize;
				this.estimatedRevenue = estimatedRevenue;
			}
			 public int getNoOfSubscribers() {
				 return noOfSubscribers;
			 }
			 public void setNoOfSubscribers(int noOfSubscribers) {
				 this.noOfSubscribers = noOfSubscribers;
			 }
			 public int getWatchTime() {
				 return watchTime;
			 }
			 public void setWatchTime(int watchTime) {
				 this.watchTime = watchTime;
			 }
			 public boolean isMonetize() {
				 return isMonetize;
			 }
			 public void setMonetize(boolean isMonetize) {
				 this.isMonetize = isMonetize;
			 }
			 public double getEstimatedRevenue() {
				 return estimatedRevenue;
			 }
			 public void setEstimatedRevenue(double estimatedRevenue) {
				 this.estimatedRevenue = estimatedRevenue;
			 }
	         
			 void display() {
				     super.display();
				    System.out.println("Number of Subscribers: " + noOfSubscribers);
				    System.out.println("Watch Time: " + watchTime + " hours");
				    System.out.println("Monetized: " + isMonetize);
				    System.out.println("Estimated Revenue: $" + estimatedRevenue);
				}

	         
}// youtubeaccount ends here
class RegisterAccount{
	public static void main(String[] args) {
		InstagramAccount insta = new InstagramAccount("Yogeshwar", "yogeshwar@email.com", true, false, "India", 25, 455, 54, "24-10-2025", 100, 150, 10, 5, 20, 7);
           insta.display();
           System.out.println("\n\n");
           LinkdenAccount link = new LinkdenAccount("Yogeshwar", "yogeshwar@gmail.com", true, true, "India", 20, 150, 30, "24-10-2025", 500, 200, 25);
              link.display();
              System.out.println("\n\n");
              YoutubeAccount yt = new YoutubeAccount("Yogeshwar", "yogeshwar@gmail.com", true, true, "India", 40, 2500, 300, "24-10-2025", 50000, 12000, true, 1500.75);
                  yt.display();
           
	}
}

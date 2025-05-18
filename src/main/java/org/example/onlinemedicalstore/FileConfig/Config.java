package org.example.onlinemedicalstore.FileConfig;

public enum Config {

    USERS("medicare-1/usersDetails.json"),
    TRANSACTIONS("medicare-1/transactions.json"),
    REVIEWS("medicare-1/reviews.json"),
    ADMINS("medicare-1/admins.json"),
    ORDERS("medicare-1/orders.json"),
    SUPPLIERS("medicare-1/suppliers.json"),
    UPLOAD_DIR("C:\\Users\\CHAMA COMPUTERS\\IdeaProjects\\Online Medical Store\\src\\main\\webapp\\uploads"),
    MEDICINES("medicare-1/medicines.json"),
    VERIFIED_REVIEWS_FILE("medicare-1/verifiedReviews.json");


    private final String path;

    Config(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}

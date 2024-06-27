package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserManagementPage {
    private WebDriver driver;

    @FindBy(id = "addNewButton") // Sesuaikan dengan ID dari tombol 'Add New' di halaman user management
    private WebElement addNewButton;

    @FindBy(name = "nama") // Sesuaikan dengan nama dari elemen input Nama
    private WebElement namaField;

    @FindBy(name = "nisn") // Sesuaikan dengan nama dari elemen input NISN
    private WebElement nisnField;

    @FindBy(name = "kelas") // Sesuaikan dengan nama dari elemen dropdown Kelas
    private WebElement kelasDropdown;

    @FindBy(name = "tanggalLahir") // Sesuaikan dengan nama dari elemen input Tanggal Lahir
    private WebElement tanggalLahirField;

    @FindBy(name = "alamat") // Sesuaikan dengan nama dari elemen input Alamat
    private WebElement alamatField;

    @FindBy(name = "email") // Sesuaikan dengan nama dari elemen input Email
    private WebElement emailField;

    @FindBy(name = "password") // Sesuaikan dengan nama dari elemen input Password
    private WebElement passwordField;

    @FindBy(name = "confirmPassword") // Sesuaikan dengan nama dari elemen input Confirm Password
    private WebElement confirmPasswordField;

    @FindBy(css = "button[type='submit']") // Sesuaikan dengan selector dari tombol Save
    private WebElement saveButton;

    @FindBy(id = "successMessage") // Sesuaikan dengan ID dari elemen pesan sukses
    private WebElement successMessage;

    public UserManagementPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAddNewButton() {
        addNewButton.click();
    }

    public void enterNama(String nama) {
        namaField.sendKeys(nama);
    }

    public void enterNISN(String nisn) {
        nisnField.sendKeys(nisn);
    }

    public void selectKelas(String kelas) {
        kelasDropdown.sendKeys(kelas);
    }

    public void enterTanggalLahir(String tanggalLahir) {
        tanggalLahirField.sendKeys(tanggalLahir);
    }

    public void enterAlamat(String alamat) {
        alamatField.sendKeys(alamat);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }
}


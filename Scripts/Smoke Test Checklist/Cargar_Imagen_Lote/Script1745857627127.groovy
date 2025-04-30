import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
//Librerias externas
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import java.io.File as File
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.interactions.Actions as Actions
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection

/**
 * [Automated Test Case]
 * Script ID: CP_04
 * Referencia Manual: A completar
 * Descripción: Validar la carga de imagen sobre un lote en Administrador/Inventario.
 */
WebUI.openBrowser('')

WebUI.navigateToUrl('https://qaplg.plataformagroup.cl/QA_REL_VACIO_04/Admin/Default.aspx')

WebUI.setText(findTestObject('Object Repository/Page_Administrador/input_Nombre Usuario_txtUsername'), user)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Administrador/input_Password_txtPassword'), password)

WebUI.click(findTestObject('Object Repository/Page_Administrador/span_Login'))

// Demorar 4 segundos el script para esperar a que la pagina recargue completamente
WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_Administrador/a_Inicio'))

WebUI.click(findTestObject('Object Repository/Page_Administrador/a_Administrador Remates'))

WebUI.click(findTestObject('Object Repository/Page_Administrador/span_Nmina Remates'))

WebUI.click(findTestObject('Object Repository/Page_Administrador/span_Opciones'))

//WebUI.click(findTestObject('Object Repository/Page_Administrador/a_Lotes Remate'))

// Usa Robot para pegar la ruta en el cuadro de diálogo
Robot robot = new Robot()

// Simular CTRL para pegar la ruta
robot.keyPress(KeyEvent.VK_CONTROL)
robot.keyRelease(KeyEvent.VK_CONTROL
)

robot.keyPress(KeyEvent.VK_DOWN)
robot.keyRelease(KeyEvent.VK_DOWN
)

robot.keyPress(KeyEvent.VK_DOWN)
robot.keyRelease(KeyEvent.VK_DOWN
)

robot.keyPress(KeyEvent.VK_DOWN)
robot.keyRelease(KeyEvent.VK_DOWN
)

// Pulsar Enter para confirmar
robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER //  Libero el ENTER
	)

WebUI.click(findTestObject('Object Repository/Page_Administrador/span_Opciones (5)'))

WebUI.click(findTestObject('Object Repository/Page_Administrador/span_Imgenes Lote'))

WebUI.click(findTestObject('Object Repository/Page_Administrador/button_Adjuntar'))

WebUI.click(findTestObject('Object Repository/Page_Administrador/span_Seleccione'))

WebUI.click(findTestObject('Object Repository/Page_Administrador/span_Imagenes del Lote                     _b21c55'))

WebUI.click(findTestObject('Object Repository/Page_Administrador/label_Seleccionar Archivo'))

// Obtén el WebDriver actual
WebDriver driver = DriverFactory.getWebDriver()

// Usa Actions para navegar (asegúrate de que el foco está donde debe)
Actions actions = new Actions(driver)

// Ruta del archivo que deseas cargar
String filePath = 'C:\\Users\\admin\\Desktop\\001_LOTE_01.jpg'

// Copiar la ruta al portapapeles
StringSelection selection = new StringSelection(filePath)

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null)

// Usa Robot para pegar la ruta en el cuadro de diálogo
//Robot robot = new Robot()

// Simular CTRL+V para pegar la ruta
robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_V //  Libero la V
    )

robot.keyRelease(KeyEvent.VK_CONTROL //  Libero el Ctrl
    )

// Pulsar Enter para confirmar
robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER //  Libero el ENTER
    )

// Demorar 4 segundos el script para esperar a que la pagina recargue completamente
WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_Administrador/button_Cargar Todo'))

// Demorar  segundos el script para esperar a que la pagina recargue completamente
WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Administrador/div_Operacin ExitosaArchivo(s) cargado(s) e_eb75a0'), 
    10)


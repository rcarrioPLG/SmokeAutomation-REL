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

import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

/**
 * [Automated Test Case]
 * Script ID: CP_03
 * Referencia Manual: A completar
 * Descripción: Validar la modificación del valor en campo "Minimo" de un lote en Administrador/Inventario.
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

WebUI.click(findTestObject('Object Repository/Page_Administrador/a_Editar Lote (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Administrador/input__txtMinimo'), '1.000.001')

WebUI.click(findTestObject('Object Repository/Page_Administrador/span_Grabar (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Administrador/div_El registro ha sido modificado correctamente (1)'), 
    'El registro ha sido modificado correctamente.')

WebUI.click(findTestObject('Object Repository/Page_Administrador/span_Aceptar (2)'))


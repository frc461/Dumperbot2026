package frc.robot.subsystems;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.VoltageOut; 
import com.ctre.phoenix6.hardware.TalonFX; 
import com.ctre.phoenix6.signals.NeutralModeValue;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Hood extends SubsystemBase {
    
    private final TalonFX MainRoller1 = new TalonFX(1);
    private final TalonFX MainRoller2 = new TalonFX(2);
    private final TalonFX MainRoller3 = new TalonFX(2);
    private final TalonFX MainRoller4 = new TalonFX(2);
    private final TalonFX Kicker1 = new TalonFX(2);
    private final TalonFX Kicker2 = new TalonFX(2);
    private final TalonFX Kicker3 = new TalonFX(2);
    



    public Hood() {
        configureMotor(motor1);
        configureMotor(motor2);
    }

    private final VoltageOut voltageControl = new VoltageOut(0);

    private void configureMotor(TalonFX motor) {
        TalonFXConfiguration config = new TalonFXConfiguration(); 

        config.CurrentLimits.SupplyCurrentLimit = 40.0; 
        config.CurrentLimits.SupplyCurrentLowerLimit = 30.0; 
        config.CurrentLimits.SupplyCurrentLowerTime = 0.1; 
        config.CurrentLimits.StatorCurrentLimit = 60.0; 
        config.CurrentLimits.StatorCurrentLimitEnable = true; 
        config.MotorOutput.NeutralMode = NeutralModeValue.Brake; 
        motor.getConfigurator().apply(config); }
}

package frc.robot.subsystems;

import com.revrobotics.spark.SparkBase;
import com.revrobotics.spark.SparkLowLevel;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkMaxConfig;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.config.PivotConfig;

public class Pivot extends SubsystemBase {
  private SparkMax pivot = new SparkMax(1, SparkLowLevel.MotorType.kBrushless);
  private PIDController pid =
      new PIDController(PivotConfig.PIVOT_P, PivotConfig.PIVOT_I, PivotConfig.PIVOT_D);

  public Pivot() {
    pivot.configure(
        new SparkMaxConfig()
            .smartCurrentLimit(PivotConfig.PIVOT_CURRENT_LIMIT)
            .idleMode(PivotConfig.PIVOT_IDLE_MODE),
        SparkBase.ResetMode.kResetSafeParameters,
        SparkBase.PersistMode.kPersistParameters);
  }
  // danny davidio
}

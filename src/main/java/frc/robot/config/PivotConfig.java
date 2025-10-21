package frc.robot.config;

import com.revrobotics.spark.config.SparkBaseConfig;

public class PivotConfig {
  public static final double PIVOT_P = 0.0;
  public static final double PIVOT_I = 0.0;
  public static final double PIVOT_D = 0.0;

  public static final int PIVOT_CURRENT_LIMIT = 10;
  public static final SparkBaseConfig.IdleMode PIVOT_IDLE_MODE = SparkBaseConfig.IdleMode.kBrake;
}

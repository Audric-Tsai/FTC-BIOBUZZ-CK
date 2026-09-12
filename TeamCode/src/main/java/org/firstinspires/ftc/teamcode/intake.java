package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "Auto Gabungan (Belajar)", group = "Belajar")
public class intake extends LinearOpMode {
    private DcMotor intake;

    @Override
    public void runOpMode() {

        // ==========================================
        // THIS IS YOUR "INIT" SECTION
        // ==========================================
        // 1. Map your hardware
        intake = hardwareMap.get(DcMotor.class, "intake");

        // 2. Set motor directions, brake modes, etc.
        intake.setDirection(DcMotor.Direction.FORWARD);
        intake.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        // 3. Send telemetry to the driver station so they know it's ready
        telemetry.addData("Status", "Initialized. Waiting for Start...");
        telemetry.update();

        // 4. Wait for the driver to press the START button
        waitForStart();

        // ==========================================
        // THIS IS YOUR "LOOP" / RUN SECTION
        // ==========================================
        // Anything after waitForStart() runs when the match begins
        while (opModeIsActive()) {
            // Your autonomous code goes here
            intake.setPower(1.0);
        }
    }
}
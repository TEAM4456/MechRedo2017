# MechRedo2017

## Objectives

* Rewrite the 2017 robot code using a new structure
* Teach new programmers how to write code for the robot
* Implement new, experimental features (closed-loop control, pathfinding, etc)

## Tasks
* [ ] **Drivetrain** (Andrew)
	* Difficulty: HARD
	- [ ] Open-loop teleop
	- [ ] Closed-loop teleop
	- [ ] Integrate Pathfinder
	- [ ] Get everything working fluidly and seamlessly between modes
	- [ ] Rotational control for CV
* [ ] **Flywheel** (unassigned)
	* Difficulty: MODERATE
	- [ ] Be able to control speed
	- [ ] Challenge (hard): use encoder to set RPM target
		- [ ] Alternative 1 (moderate): use dead reckoning to estimate RPM target
		- [ ] Alternative 2 (easy): use analog trigger to set speed
	- [ ] Challenge: follow speed curve to rev quickly then apply less power
* [ ] **Revolver** (unassigned)
	* Difficulty: EASY
	- [ ] Be able to spin in correct direction
	- [ ] Challenge: be able to spin backwards for a second, then resume
* [ ] **Intake** (unassigned)
	* Difficulty: EASY
	- [ ] Be able to spin in correct direction
* [ ] **Deflector** (unassigned)
	* Difficulty: HARD
	- [ ] Use PID to control the position of the deflector
	- [ ] Challenge (important): home the deflector using the limit switch
		- [ ] Extended: set a maximum position to prevent overextension
	- [ ] Challenge: calculate angle from position, and be able to set angle target
* [ ]  **Winch** (unassigned)
	* Difficulty: EASY
	- [ ] Be able to spin in both directions
	- [ ] Be able to toggle between two different speeds
		- Forwards: fast or slow
		- Backwards: slow only

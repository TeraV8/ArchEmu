package io.terav.archemu;

public abstract class MachineContainer {
    // hey put something here
    /**
     * A definition class for modifying architecture characteristics before machine creation
     */
    public abstract class ArchitectureVariation {
        /**
         * The name of this architecture variation preset, or "custom" if this isn't a preset
         */
        public final String name;
        public final boolean preset;
        /**
         * Create an architecture variation with default parameters
         * @param name The name of the preset, or null if not a preset
         */
        protected ArchitectureVariation(String name) {
            if (preset = (name != null))
                this.name = name;
            else
                this.name = "custom";
        }
    }
}

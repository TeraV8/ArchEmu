package io.terav.archemu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AsmVM32Container extends MachineContainer {
    public static final String ARCH_NAME = "asmvm32";
    public static final List<ArchitectureVariation> PRESETS;
    static {
        ArrayList<ArchitectureVariation> presets = new ArrayList<>();
        PRESETS = Collections.unmodifiableList(presets);
    }
    
    public AsmVM32Container() {
        
    }
    public class AsmVM32Variation extends ArchitectureVariation {
        private boolean hwint = false;
        private boolean hwstack = true;
        private boolean extmath = false;
        private boolean extmem = false;
        private AsmVM32Variation(String presetName) {
            super(presetName);
        }
        /**
         * AsmVM32 with architecture features of the latest release (modern ver.)
         */
        public AsmVM32Variation() {
            this(null);
        }
        public boolean hasHardwareInterrupts() {
            return hwint;
        }
        public boolean hasHardwareStack() {
            return hwstack;
        }
        public boolean hasMathExtensions() {
            return extmath;
        }
        public boolean hasMemoryExtensions() {
            return extmem;
        }
        public void setHardwareInterrupts(boolean hasHwint) {
            if (preset) throw new UnsupportedOperationException("Cannot change settings of a preset");
            hwint = hasHwint;
        }
        public void setHardwareStack(boolean hasHwstack) {
            if (preset) throw new UnsupportedOperationException("Cannot change settings of a preset");
            hwstack = hasHwstack;
        }
        public void setExtendedMath(boolean hasExtmath) {
            if (preset) throw new UnsupportedOperationException("Cannot change settings of a preset");
            extmath = hasExtmath;
        }
        public void setExtendedMem(boolean hasExtmem) {
            if (preset) throw new UnsupportedOperationException("Cannot change settings of a preset");
            extmem = hasExtmem;
        }
    }
}

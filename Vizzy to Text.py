import os

# Default Vizzy program location.
vizzyProgramFileDirectory = os.path.expanduser(
    '~') + "\\AppData\\LocalLow\\Jundroo\\SimpleRockets 2\\UserData\\FlightPrograms\\"
vizzyProgramName = ""

# Get Vizzy program name
while len(vizzyProgramName) == 0:
    vizzyProgramName = input(
        "Please enter the name of the Vizzy program (do not include .xml). \n")

vizzyProgramDirectory = vizzyProgramFileDirectory + vizzyProgramName + ".xml"

print("Printing out " + vizzyProgramDirectory)
vizzyProgram = open(vizzyProgramDirectory, "r").readlines()
print(vizzyProgram)

# Creates output directory
try:
    outputPath = str(os.path.expanduser(
        '~')) + "\\AppData\\LocalLow\\Jundroo\\SimpleRockets 2\\Text-Based-Vizzy\\DecimpiledPrograms"
    os.makedirs(outputPath)
except OSError:
    print("Creation of the output directory %s failed" % outputPath)
    quit()

# Creates output file
outputFile = open(vizzyProgramName + ".vizzy", "w")

# Writes variable declaration


class Instruction:
    name = ""


class ProgramFlow(Instruction):  # The blue blocks
    pass


class CraftInstructions(Instruction):  # The black blocks
    pass


class Events(Instruction):  # The yellow blocks
    pass


class Lists(Instruction):  # The purple blocks
    pass


class MultifunctionDisplay(Instruction):  # The light blue blocks
    pass


class Expression:
    name = ""
    operands = []


class Operators(Expression):  # The blue capsules
    pass


class CraftInformation(Expression):  # The black capsules
    pass


class ListExpressions(Expression):  # The purple capsules
    pass


class MultifunctionDisplayExpression(Expression):  # The light blue capsules
    pass


def flattenElement(element):
    envelopingBlocks = ["While", "If", "Repeat"]
    blocks = ["Event", "SetVariable", "BroadcastMessage", "Comment", "WaitSeconds",
              "CallCustomInstruction", "WaitUntil", "SetInput", "SetActivationGroup", ]
    return ""
